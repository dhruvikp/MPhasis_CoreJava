package com.simplilearn.innerclass;

public class MemberInnerclassExample {
	private String msg = "Hello!";
	
	class Inner {
		void hello() {
			System.out.println(msg+"Welcome to Simplilearn");
		}
	}
	
	
	public static void main(String[] args) {
		 
		// Create obj of outer class
		MemberInnerclassExample outer = new MemberInnerclassExample();
		
		// Create obj of inner class using outer class object
		MemberInnerclassExample.Inner innerObj = outer.new Inner();
		
		innerObj.hello();
	}
	
}
