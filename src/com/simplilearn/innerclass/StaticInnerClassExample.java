package com.simplilearn.innerclass;

public class StaticInnerClassExample {

	static int data = 10;
	
	static class Inner {
		void msg() {
			System.out.println("Hello ! Welcome to simplilearn!"+data);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		StaticInnerClassExample.Inner ob = new StaticInnerClassExample.Inner();
		//StaticInnerClassExample.data;
		ob.msg();
		
		

	}

}
