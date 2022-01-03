package com.simplilearn.innerclass;


interface TestAbstractClass {
	 void display();
}


public class AnonymousInnerClassExmple {
	public static void main(String[] args) {
		TestAbstractClass obj = new TestAbstractClass() {
			
			@Override
			public void display() {
				System.out.println("Hello! Welcome to Simplilearn");
				
			}
		};
		obj.display();
	}
}
