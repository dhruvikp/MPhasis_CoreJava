package com.simplilearn.CollectionFramework;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.push("Piyush");
		stack.push("Alex");
		stack.push("Scott");
		stack.push("Dhruvik");
		stack.push("Vinay");
		
		
		String s1 = stack.pop();
		System.out.println(s1);
		
		
		
	}

}
