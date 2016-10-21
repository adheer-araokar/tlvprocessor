package com.java.processor.InputOutputImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

import com.java.processor.InputOutputInterfaces.InputOutputInterface;

public class StandardInput implements InputOutputInterface {

	public Reader getReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}

	public Writer getWriter() {
		return new BufferedWriter(new OutputStreamWriter(System.out));
	}
}
