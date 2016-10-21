package com.java.processor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

import com.java.processor.InputOutputImpl.StandardInput;
import com.java.processor.InputOutputInterfaces.InputOutputInterface;
import com.java.processor.OperationsImpl.StringReplace;
import com.java.processor.OperationsImpl.StringUpperCase;
import com.java.processor.OperationsInterface.Operations;

public class TLVProcessor {
	
	public static void main(String[] args) throws IOException{
		InputOutputInterface inout = new StandardInput();
		BufferedReader reader = (BufferedReader)inout.getReader();
		BufferedWriter writer = (BufferedWriter)inout.getWriter();
		String input;
		while(true){
			input = reader.readLine();
			if(input == null)
				break;
			parseInputStringAndOperate(input, writer);
		}
	}
	
	private static void parseInputStringAndOperate(String input, Writer writer) throws IOException{
		String type;
		int strLen;
		String convert;
		boolean continued = true;
		while(continued){
			continued = false;
			type = input.substring(0, 6);
			strLen = Integer.parseInt(input.substring(7, 11));
			convert = input.substring(12, 12+strLen);
			operate(type, convert, writer);
			if(input.length() > (12+strLen)){
				input = input.substring(12+strLen);
				continued = true;
			}
		}
	}
	
	private static void operate(String type, String subject, Writer writer) throws IOException{
		BufferedWriter bWriter = (BufferedWriter)writer;
		Operations operation;
		if(type.equals("UPPRCS")){
			operation = StringUpperCase.getInstance();
		}
		else if(type.equals("REPLCE")){
			operation = StringReplace.getInstance();
		}
		else{
			bWriter.write("Type not valid\n");
			bWriter.flush();
			return;
		}
		bWriter.write(operation.operate(subject)+"\n");
		bWriter.flush();
	}
	
}
