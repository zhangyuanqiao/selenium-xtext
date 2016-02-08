package selpluginproj.handlers;

import org.eclipse.emf.ecore.EObject;
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
	
	// switch case for ALL orders  TODO : implement all orders
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
			
	}
	
	
	
	
	
	
	
	/////////////////////////////////  ACTIONS  /////////////////////////////////////
	
	private static void click(String name) {fineElementFinder(name).click();}
	

	private static void navigateTo(String url){SEL_DRIVER.get(url);}
	
	
	private static void fillWith(String field,String value){ fineElementFinder(field).sendKeys(value);}
	
	
	
	
	/////////////////////////////////////  UTILITIES  /////////////////////////////////////////
	
	
	private static WebElement fineElementFinder(String clue){
		WebElement ret = null;
		try{ // Keep adding some if function is not powerful enough !
			ret = SEL_DRIVER.findElement(By.name(clue));   //find element using tag 'name'
		}catch(Exception e){
			ret = SEL_DRIVER.findElement(By.xpath("[text()[contains(.,'"+clue+"')]")); //find element by text 	
		} 		
		return ret;
	}
	

}
