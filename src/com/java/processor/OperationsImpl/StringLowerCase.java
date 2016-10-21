package com.java.processor.OperationsImpl;

import com.java.processor.OperationsInterface.Operations;

public class StringLowerCase implements Operations {

	private static StringLowerCase instance = null;
	
	private StringLowerCase(){}
	
	public static StringLowerCase getInstance(){
		if(instance == null){
			instance = new StringLowerCase();
		}
		return instance;
	}
	
	public String operate(String subject) {
		return("LOWRCS-"+subject.toLowerCase());
	}

}
