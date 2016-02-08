package selpluginproj.handlers;

import org.eclipse.emf.ecore.EObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.xtext.example.mydsl.myDsl.*;
import org.xtext.example.mydsl.myDsl.Object;



public class Interpretor {
	
	private static  WebDriver SEL_DRIVER = null;

	public Interpretor(){}
	
	public void execute(Main main){		
		System.out.println("Let's execute "+main.getFileName()+" !!! ");	
		switch (main.getBrowserName()) {
		case "Firefox":
			SEL_DRIVER = new FirefoxDriver();
			break;

		default:
			SEL_DRIVER = new FirefoxDriver();
			break;
		}
		for(EObject e : main.getOrders()){this.execute(e);}		
	}

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
	
	private static void click(String name) {
		SEL_DRIVER.findElement(By.name(name)).click();
		
	}

	private static void navigateTo(String url){
		System.out.println("On va vers " + url);		
		SEL_DRIVER.get(url);
	}
	
	private static void fillWith(String field,String value){
		SEL_DRIVER.findElement(By.name(field)).sendKeys(value);
	}
	

}
