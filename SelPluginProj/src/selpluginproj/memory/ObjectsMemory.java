package selpluginproj.memory;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.xtext.example.mydsl.myDsl.SubProcedure;

public class ObjectsMemory  {
	private HashMap<String, WebElement> webElements;
	private HashMap<String, SubProcedure> subprocedures;

	public ObjectsMemory(){
		webElements = new HashMap<String, WebElement>();
		subprocedures = new HashMap<String, SubProcedure>();
	}

	public void put(String key, SubProcedure value){
		subprocedures.put(key, value);
	}

	public void put(String key, WebElement value){
		webElements.put(key,value);
	}

	public SubProcedure getSubProcedure(String subProcedureName) {
		return subprocedures.get(subProcedureName);
	}

	public WebElement getWebElement(String webElementName){
		return webElements.get(webElementName);
	}
	
	public void redefine(String key,WebElement value){
		webElements.replace(key, value);
	}
	
	public void redefine(String key,SubProcedure proc){
		subprocedures.replace(key, proc);
	}

	public boolean hasKey(String key){
		return webElements.keySet().contains(key)||subprocedures.keySet().contains(key);
	}

	public boolean remove(String key){
		boolean ret = this.hasKey(key);
		webElements.remove(key);
		subprocedures.remove(key);
		return ret;
	}
	
	

}
