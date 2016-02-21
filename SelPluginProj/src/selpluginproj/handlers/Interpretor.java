package selpluginproj.handlers;

import java.util.List;

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
import org.xtext.example.mydsl.myDsl.impl.ObjectImpl;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.ObjectElements;

import selpluginproj.memory.ObjectsMemory;

public class Interpretor {
	private static  WebDriver SEL_DRIVER = null;
	private static ObjectsMemory OBJECTS_MEMORY = null;

	public Interpretor(){}

	public void execute(Main main){		
		System.out.println("Let's execute "+main.getFileName()+" !!! ");
		OBJECTS_MEMORY = new ObjectsMemory();
		//which browser should we use ?
		switch (main.getBrowserName()) {
		case "Firefox":
			SEL_DRIVER = new FirefoxDriver();
			break;
		case "Chrome":
			System.out.println("Sorry, this borwser is not available yet");
			SEL_DRIVER = new FirefoxDriver();
		case "Internet Explorer" : 
			System.out.println("Sorry, this borwser is not available yet");
			SEL_DRIVER = new FirefoxDriver();
		default:
			SEL_DRIVER = new FirefoxDriver();
			break;
		}
		//execute all orders
		for(EObject e : main.getOrders()){this.execute(e);}	

		System.out.println("Done with "+main.getFileName()+" ! ");
	}

	/**
	 *  switch case for ALL orders 
	 * @param e the EObject w'd like to know more about 
	 */
	private void execute(EObject e) {
		if(e instanceof Refresh){
			refresh();
		}
		else if(e instanceof Navigate){
			navigateTo(((Navigate)e).getUrl());
		}
		else if (e instanceof Store){
			store((Store)e);
		}
		else if (e instanceof ReDefine){
			redefine((ReDefine)e);
		}
		else if (e instanceof Delete){
			delete((Delete)e);
		}
		else if(e instanceof ActionSelect){
			select((ActionSelect)e);
		}
		else if(e instanceof ActionWithObject){
			ActionWithObject awo = (ActionWithObject)e;
			execute(awo.getObject(),awo);
		}
		else if(e instanceof CheckBox){
			tickBox((CheckBox)e);
		}
		else if (e instanceof Rickroll){
			rickRoll();
		}	
		else if (e instanceof DoWait){
			waitFor(((DoWait)e).getMillisec());
		}
		//conditions : 
		else if (Condition.class.isAssignableFrom(e.getClass())){
			eval((Condition)e);
		}
		//structures : 
		else if (e instanceof If){
			If i = ((If)e);
			structureIf(i.getCond(),i.getActionThen(),i.getActionElse());
		}
		else if(e instanceof Loop){
			Loop i = (Loop)e;
			structureLoop(i.getCond(),i.getMilliseconds(),i.getActions());
		}
		else if (e instanceof DoAll){
			DoAll i = (DoAll)e;
			structureDoAll(i.getColl(),i.getTodo());
		}
		else if (e instanceof Execute){

			executeSubProcedure((Execute)e);
		}
	}

	/////////////////////////////////  ACTIONS  /////////////////////////////////////

	/**
	 * Executes ActionWithObject
	 * @param object
	 * @param action
	 */
	private void execute(Object object, ActionWithObject action) {
		if(action instanceof Click){
			System.out.println("clicking "+object.toString());
			click(object);
		}
		else if(action instanceof Fill){
			fillWith(object,((Fill)action).getContent());
		}
	}

	private void refresh() {SEL_DRIVER.get(SEL_DRIVER.getCurrentUrl());}

	private static void navigateTo(String url){SEL_DRIVER.get(url);}

	/** 
	 * Trouve un webElement selon les parametres de l'objet de e.
	 * Place cet élément dans OBJECTS_MEMORY,
	 * en lui donnant pour clé le nom ObjName en attribu de e.
	 * 
	 * Si le paramètre est un subprocedure, l'élément est à placer dans
	 * SUBPROC_MEMORY
	 * 
	 * @param e
	 */
	private void store(Store e) {
		if(OBJECTS_MEMORY.hasKey(e.getObjName())){
			System.out.println("this name is already taken ! ");
		}
		else{
			if(e.getObj() instanceof SubProcedure){
				OBJECTS_MEMORY.put(e.getObjName(), (SubProcedure)e.getObj());
			}
			else if (e.getObj() instanceof Collection) {
				findCollection((Collection)e.getObj());
			}
			else{
				WebElement we = findObject(e.getObj());			
				if(we!=null)OBJECTS_MEMORY.put(e.getObjName(), we );
				else{System.out.println("Could not find this object in the page");}
			}
		}
	}

	private void delete(Delete e) {
		OBJECTS_MEMORY.remove(e.getObjName());
	}

	private void redefine(ReDefine e) {
		WebElement we = findObject(e.getObj());
		if(we==null){
			System.out.println("Could not update object definition... no object found");
		}
		else OBJECTS_MEMORY.redefine(e.getObjName(), we);
	}

	private static void select(ActionSelect actionSelect) {
		try{
			String selector = actionSelect.getXpath()+"/option[contains(text(),'"+actionSelect.getOption()+"')]";
			Select seleniumSelect = new Select(SEL_DRIVER.findElement(By.xpath(actionSelect.getXpath())));
			seleniumSelect.selectByVisibleText(SEL_DRIVER.findElement(By.xpath(selector)).getText());
		}catch(Exception e){
			System.out.println("option was not selected by select... \n");
			e.printStackTrace();
		}
	}
	private static void click(Object object) {findObject(object).click();}

	private static void fillWith(Object obj,String content){ findObject(obj).sendKeys(content);}

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

	private void rickRoll() {
		String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
		SEL_DRIVER.get(url);
	}

	/**
	 * Permet d'attendre avant la reprise de l'execution du script
	 * @param millisec
	 */
	private void waitFor(int millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			System.out.println("For some reason I don't feel sleepy");
			e.printStackTrace();
		}
	}

	/////////////// CONDITIONS ///////////////////

	private boolean not(Condition cond) {return eval(cond);}

	/**
	 * Cherche un texte dans un objet de la page
	 * 
	 * @param text
	 * @param object
	 * @return
	 */
	private boolean lookFor(IsIn i) {
		String text = i.getText();
		if(i.getBody() != null && i.getBody().equals("body")){
			try {
				SEL_DRIVER.findElement(By.xpath("//*[contains(., '"+text+"')]"));
				return true;
			} catch (Exception e) {
				System.out.println("Did not find "+text+" in body");
				return false;
			}
		}
		else{ 
			//System.out.println("WARNING !!!! Method lookFor(text,object) is not fully implemented)");
			WebElement el = findObject(i.getObj());
			return el.getText().contains(text);
		}
	}

	/////////////////////////////// STRUCTURES ///////////////////////////////////////

	private void structureIf(Condition cond, EList<Action> actionThen, EList<Action> actionElse) {
		if(eval(cond)){
			for(Action e : actionThen){execute(e);}
		}
		else{
			for(Action e : actionElse){execute(e);}
		}
	}
	/**
	 * Un while, capable d'attendre entre deux executions
	 * @param cond
	 * @param milliseconds
	 * @param actions
	 */
	private void structureLoop(Condition cond, int milliseconds, EList<Action> actions) {
		while(eval(cond)){
			for(Action a : actions){
				execute(a);
			}
			waitFor(milliseconds);
		}
	}
	/**
	 * Applique une suite d'actions sur tous les éléments d'une collection
	 * @param coll
	 * @param todo
	 */
	private void structureDoAll(Collection coll, EList<EObject> todo) {
		if(coll.getObj()!=null){
			for(Object o : coll.getObj()){
				for(EObject action : todo){
					if(ActionWithObject.class.isAssignableFrom(action.getClass())) {
						ActionWithObject awo = (ActionWithObject)action;
						awo.setObject(o);
						execute(awo);
					}
					else{
						execute(action);
					}
				}		
			}
		}
		else{ 
			List<WebElement> list = findCollection(coll);
			for(WebElement we : list){
				for(EObject action: todo){
					if(ActionWithObject.class.isAssignableFrom(action.getClass())) {
						ActionWithObject awo = (ActionWithObject)action;				
						awo.setObject((Object) we);
						execute(awo);
					}
					else{
						execute(action);
					}
				}
			}
		}
	}
	/**
	 * Gets subProcedure by its name and execute all actions and structures in it
	 * @param subProcedureName
	 */
	private void executeSubProcedure(Execute execute) {
		String subProcedureName = execute.getSubProcedureName();
		if(subProcedureName!=null){
			SubProcedure sp = OBJECTS_MEMORY.getSubProcedure(subProcedureName);
			if(sp!=null && sp instanceof SubProcedure){
				for(EObject e : sp.getActions()){
					execute(e);
				}
			}
			else{
				System.out.println("Procedure "+subProcedureName+" is not defined or is not a procedure.");
			}
		}
		else{
			for(EObject e : execute.getSubprocedure().getActions()){
				execute(e);
			}
		}
	}

	/////////////////////////////////////  UTILITIES  /////////////////////////////////////////

	private boolean eval(Condition e){

		if (e instanceof IsIn){
			IsIn i = (IsIn)e;
			return lookFor(i);	
		}
		else if (e instanceof Not) {
			return not(((Not)e).getCond());
		}
		return false;
	}

	private static WebElement findObject(Object obj) {
		if(obj.getObjName()!=null){ //memorized
			return OBJECTS_MEMORY.getWebElement(obj.getObjName());
		}
		else if(obj.getObjectDef()!=null){
			switch (obj.getHtmltype().getType()) {
			case "guess":		return fineElementFinder(obj.getObjectDef());
			case "CSS Selector":return SEL_DRIVER.findElement(By.cssSelector(obj.getObjectDef()));
			case "XPath": 		return SEL_DRIVER.findElement(By.xpath(obj.getObjectDef())); 
			case "id" : 		return SEL_DRIVER.findElement(By.id(obj.getObjectDef()));
			case "name":		return SEL_DRIVER.findElement(By.name(obj.getObjectDef()));
			case "title":		return SEL_DRIVER.findElement(By.xpath("//*[contains(@title, '"+obj.getObjectDef()+"')]")); 
			case "class":		return SEL_DRIVER.findElement(By.xpath("//*[contains(@class, '"+obj.getObjectDef()+"')]"));
			default: System.out.println("Did not recognize this type of object"); return null;
			}
		}
		System.out.println("You make no sense... did you try to call a procedure instead of an element ?");
		return null;
	}
	private static List<WebElement> findCollection(Collection coll){
		System.out.println(coll.getHtmltype().toString());
		switch (coll.getHtmltype().toString()) {
		case "CSS Selector":return SEL_DRIVER.findElements(By.cssSelector(coll.getObjectRule()));
		case "XPath":		return SEL_DRIVER.findElements(By.xpath(coll.getObjectRule())); 
		case "id" :		 	return SEL_DRIVER.findElements(By.id(coll.getObjectRule()));
		case "name":		return SEL_DRIVER.findElements(By.name(coll.getObjectRule()));
		case "title":		return SEL_DRIVER.
				findElements(
						By.xpath("//*[contains(@title, '"+coll.getObjectRule()+"')]")
						);
		default: System.out.println("Did not recognize this type of object"); break;
		}
		return null;
	}
	/**
	 * Permet de trouver un élément dans une page avec un minimum d'effort pour l'utilisateur
	 * Pour l'instant c'est hyper brouillon, faut repasser dessus
	 * @param clue
	 * @return
	 */
	private static WebElement fineElementFinder(String clue){
		WebElement ret = null;
		Exception e = null;
		try{ //TODO Make this stuff smarter by proper use of xpath
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
}