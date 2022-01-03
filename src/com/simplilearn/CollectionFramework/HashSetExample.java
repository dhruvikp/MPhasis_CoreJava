package com.simplilearn.CollectionFramework;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("Ravi");
		set.add("Abhishek");
		set.add("Nishchith");
		set.add("Abhishek");
		
		
		for(String elem : set) {
			System.out.println(elem);
		}

	}

}
