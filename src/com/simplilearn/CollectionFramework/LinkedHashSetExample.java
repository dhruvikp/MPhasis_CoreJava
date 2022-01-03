package com.simplilearn.CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.add("Ravi");
		set.add("Abhishek");
		set.add("Nishchith");
		set.add("Abhishek");
		set.add(null);
		set.add(null);
		
		
		
		for(String elem : set) {
			System.out.println(elem);
		}

		

	}

}
