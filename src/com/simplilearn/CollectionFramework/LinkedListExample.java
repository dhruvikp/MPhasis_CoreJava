package com.simplilearn.CollectionFramework;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Ravi");
		list.add("Vinay");
		list.add("Dhruvik");
		list.add("Dhruvik");
		
		
		for(String value : list) {
			System.out.println(value);
		}
	}
}
