package selpluginproj.handlers;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.myDsl.Main;
import org.xtext.example.mydsl.myDsl.Navigate;

public class Interpretor {

	public Interpretor(){}
	
	public void execute(Main main){		
		System.out.println("Let's execute "+main.getFileName()+" ! ");	
		for(EObject e : main.getOrders()){this.execute(e);}		
	}

	private void execute(EObject e) {
		if(e instanceof Navigate) System.out.println("On va vers " + ((Navigate)e).getUrl());		
	}
	
}
