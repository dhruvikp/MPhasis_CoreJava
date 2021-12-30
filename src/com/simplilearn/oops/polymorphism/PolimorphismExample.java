package com.simplilearn.oops.polymorphism;


class Calculator {
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return (a+b+c);
	}
}


public class PolimorphismExample {

	public static void main(String[] args) {
		System.out.println(Calculator.add(5, 4));
		System.out.println(Calculator.add(1, 2, 3));
		
		
	}
}
