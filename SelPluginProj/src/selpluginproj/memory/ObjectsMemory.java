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
	
	public Set<String> keySet(){
		HashMap<String,Object> hash = new HashMap<>(webElements);
		hash.putAll(webElements);
		return hash.keySet();
	}

	public SubProcedure getSubProcedure(String subProcedureName) {
		return subprocedures.get(subProcedureName);
	}
	
	public WebElement getWebElement(String webElementName){
		return webElements.get(webElementName);
	}

}
