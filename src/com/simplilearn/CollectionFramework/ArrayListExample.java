package com.simplilearn.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Ravi");
		list.add("Supriya");
		list.add("Simplilearn");
		list.add("Ajay");
		list.add("Ravi");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
		String value = itr.next();
			System.out.println(value);
		}
		
		for(String value : list) {
			
			//
			System.out.println(value);
		}
		
		//list.remove("Ajay");
		
		
		
		
		
		

	}

}
