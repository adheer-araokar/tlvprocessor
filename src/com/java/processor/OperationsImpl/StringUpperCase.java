package com.java.processor.OperationsImpl;

import com.java.processor.OperationsInterface.Operations;

public class StringUpperCase implements Operations{
	
	private static StringUpperCase instance = null;
	
	private StringUpperCase(){}
	
	public static StringUpperCase getInstance(){
		if(instance == null){
			instance = new StringUpperCase();
		}
		return instance;
	}
	
	public String operate(String subject) {
		return("UPPRCS-"+subject.toUpperCase());
	}
	
}
