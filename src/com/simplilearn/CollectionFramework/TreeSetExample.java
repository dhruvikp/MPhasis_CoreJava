package com.simplilearn.CollectionFramework;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		
		set.add("Ravi");
		set.add("Abhishek");
		set.add("Nishchith");
		set.add("Abhishek");
		
		
		for(String elem : set) {
			System.out.println(elem);
		}
		
		

	}

}
