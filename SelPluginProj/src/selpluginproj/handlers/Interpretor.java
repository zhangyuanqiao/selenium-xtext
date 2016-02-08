package selpluginproj.handlers;

import org.eclipse.emf.ecore.EObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.xtext.example.mydsl.myDsl.Main;
import org.xtext.example.mydsl.myDsl.Navigate;


public class Interpretor {
	
	private  WebDriver SEL_DRIVER = null;

	public Interpretor(){}
	
	public void execute(Main main){		
		System.out.println("Let's execute "+main.getFileName()+" ! ");	
		switch (main.getBrowserName()) {
		case "Firefox":
			SEL_DRIVER = new FirefoxDriver();
			break;

		default:
			SEL_DRIVER = new ChromeDriver();
			break;
		}
		for(EObject e : main.getOrders()){this.execute(e);}		
	}

	private void execute(EObject e) {
		if(e instanceof Navigate){
			String url = ((Navigate)e).getUrl();
			System.out.println("On va vers " + url);		
			SEL_DRIVER.get(url);
		}
	}

}
