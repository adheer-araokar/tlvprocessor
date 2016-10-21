package com.java.processor.OperationsImpl;

import com.java.processor.OperationsInterface.Operations;

public class StringReplace implements Operations {
	
	private static StringReplace instance = null;
	
	private StringReplace(){}
	
	public static StringReplace getInstance(){
		if(instance == null){
			instance = new StringReplace();
		}
		return instance;
	}
	
	public String operate(String subject) {
		return("REPLCE-"+"THIS STRING");
	}

}
