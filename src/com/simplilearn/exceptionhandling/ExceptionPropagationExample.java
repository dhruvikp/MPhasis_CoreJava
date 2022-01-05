package com.simplilearn.exceptionhandling;

import java.io.IOException;

public class ExceptionPropagationExample {

	
	void a() throws IOException  {
		
		throw new IOException();
	}
	
	void b() throws InterruptedException, IOException {
		a();
	}
	
	void c() {
		try {
			b();	
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Internal  error handled by C");
		}
		
	}
	
	
	void test() {
		
		String s= null;
		if(s!=null) {
			s.length();	
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ExceptionPropagationExample obj = new ExceptionPropagationExample();
		obj.c();
		
		obj.test();

	}

}
