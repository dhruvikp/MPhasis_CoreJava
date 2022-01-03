package com.simplilearn.innerclass;

public class LocalInnerClassExample {
	private String msg = "Hello! Welcome to simplilearn";
	
	
	void display() {
		class Inner {
			void msg() {
				System.out.println(msg);
			}
		}
		
		Inner innerObj = new Inner();
		innerObj.msg();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalInnerClassExample demo = new LocalInnerClassExample();
		demo.display();

	}

}
