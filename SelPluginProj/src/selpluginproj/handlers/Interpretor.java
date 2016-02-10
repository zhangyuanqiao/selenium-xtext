package selpluginproj.handlers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.xtext.example.mydsl.myDsl.*;
import org.xtext.example.mydsl.myDsl.Object;



public class Interpretor {

	private static  WebDriver SEL_DRIVER = null;

	public Interpretor(){}

	public void execute(Main main){		
		System.out.println("Let's execute "+main.getFileName()+" !!! ");

		//which browser should we use ?
		switch (main.getBrowserName()) {
		case "Firefox":
			SEL_DRIVER = new FirefoxDriver();
			break;
		default:
			SEL_DRIVER = new FirefoxDriver();
			break;
		}

		//execute all orders
		for(EObject e : main.getOrders()){this.execute(e);}		
	}

	/**
	 *  switch case for ALL orders  TODO : implement all orders
	 * @param e the EObject which is an unknown 
	 */
	private void execute(EObject e) {
		if(e instanceof Navigate){
			String url = ((Navigate)e).getUrl();
			navigateTo(url);
		}
		else if(e instanceof Refresh){
			SEL_DRIVER.get(SEL_DRIVER.getCurrentUrl());
		}

		else if (e instanceof Rickroll){
			navigateTo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
		}
		else if(e instanceof Fill){
			fillWith(((Fill)e).getNametag(), ((Fill)e).getContent());
		}
		else if(e instanceof Click){
			click(((Click)e).getName());
		}
		else if(e instanceof CheckBox){
			tickBox((CheckBox)e);
		}
		
		else if(e instanceof ActionSelect){
			select((ActionSelect)e);
		}

		
		//conditions
		else if (Condition.class.isAssignableFrom(e.getClass())){
			eval((Condition)e);
		}
		

		else if (e instanceof If){
			If i = ((If)e);
			structureIf(i.getCond(),i.getActionThen(),i.getActionElse());
		}

	}


	/////////////////////////////// STRUCTURES ///////////////////////////////////////



	
	
	

	private void structureIf(Condition cond, EList<Action> actionThen, EList<Action> actionElse) {
		if(eval(cond)){
			System.out.println("Then ! ");
			for(Action e : actionThen){execute(e);}
		}
		else{
			System.out.println("Else ! ");
			for(Action e : actionElse){execute(e);}
		}
	}





	/////////////////////////////////  ACTIONS  /////////////////////////////////////

	

	private static void click(String name) {fineElementFinder(name).click();}


	private static void navigateTo(String url){SEL_DRIVER.get(url);}


	private static void fillWith(String field,String value){ fineElementFinder(field).sendKeys(value);}

	private static void tickBox(CheckBox checkBox) {
		WebElement element = null;
		try{
			element = SEL_DRIVER.findElement(By.xpath("//*/input[contains(@name,'"+checkBox.getNametag()+"')]"));
		}
		catch(Exception exception){
			try{
				element = SEL_DRIVER.findElement(By.xpath("//*/input[contains(@type,'"+checkBox.getNametag()+"')]"));
			}
			catch(Exception exception2){
				try {
					element = SEL_DRIVER.findElement(By.xpath("//*/input[contains(@value,'"+checkBox.getNametag()+"')]"));
				} catch (Exception e2) {
					
				}
			}
		}
			System.out.println(checkBox.getNewValue());
		if((element.isSelected()&&checkBox.getNewValue()=="false")
				||(!element.isSelected()&&checkBox.getNewValue()!="false")){
			element.click();
		}
		
	}
	
	private static void select(ActionSelect actionSelect) {
		try{
			
			String selector = actionSelect.getXpath()+"/option[contains(text(),'"+actionSelect.getOption()+"')]";
			System.out.println(selector);//TODO delete
			Select seleniumSelect = new Select(SEL_DRIVER.findElement(By.xpath(actionSelect.getXpath())));
			seleniumSelect.selectByVisibleText(SEL_DRIVER.findElement(By.xpath(selector)).getText());

		}catch(Exception e){
			System.out.println("option was not selected by select... \n");
			e.printStackTrace();
		
		}
		
	}





	/////////////// CONDITIONS ///////////////////
	
	private boolean not(Condition cond) {return eval(cond);}
	
	
	private boolean lookFor(String text, Object object) {
		System.out.println(object.getBody().toString());
		System.out.println(object.getBody().toString().equals("body"));
		if(object.getBody().toString().equals("body")){
			try {
				
				 SEL_DRIVER.findElement(By.xpath("//*[contains(., '"+text+"')]"));
				 return true;
			} catch (Exception e) {
				System.out.println("Did not find "+text+" in body");
				return false;
			}
		}
		else{ 
			System.out.println("WARNING !!!! Method lookFor(text,object) is not fully implemented)");
			switch (object.getBody().toString()) {
				
				//TODO implement
			default:
				return false;
			}
		}

	}


	/////////////////////////////////////  UTILITIES  /////////////////////////////////////////


	private static WebElement fineElementFinder(String clue){
		WebElement ret = null;
		Exception e = null;
		try{ //TODO Keep adding some if function is not powerful enough !
			ret = SEL_DRIVER.findElement(By.name(clue));   //find element using tag 'name'
		}catch(Exception e0){e = e0;
		try{ ret = SEL_DRIVER.findElement(By.linkText(clue)); }
		catch(Exception e1){ e = e1;
		try{ret = SEL_DRIVER.findElement(By.partialLinkText(clue)); }
		catch(Exception e2){ e = e2;
		try{ret = SEL_DRIVER.findElement(By.className(clue)); }
		catch(Exception e3){ e = e3;
		try{ret = SEL_DRIVER.findElement(By.cssSelector("value$='"+clue+"'")); }
		catch(Exception e4){ e = e4;
		try{ret = SEL_DRIVER.findElement(By.xpath("#"+clue));} //find element id
		catch(Exception e5){ e = e5;
		try{ret = SEL_DRIVER.findElement(By.xpath("//*[contains(@value, '"+clue+"')]"));}
		catch(Exception e6){ e = e6;
		System.out.println("NOTHING WAS FOUND by the fine element finder using clue : '"+clue+"' ! ");
		}
		}
		}
		}
		}
		}
		} 
		if(e!=null){
		}
		return ret;
	}

	private boolean eval(Condition e){

		if (e instanceof IsIn){
			IsIn i = (IsIn)e;
			return lookFor(i.getText(),i.getObj());	
		}
		else if (e instanceof Not) {
			return not(((Not)e).getCond());
		}
		return false;

	}




}
