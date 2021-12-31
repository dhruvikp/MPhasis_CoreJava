package com.simplilearn.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeueExample extends Object {

	public static void main(String[] args) {
		
		ArrayDeque<String> dqueue = new ArrayDeque<>();
		dqueue.add("Gautam");
		dqueue.add("Alex");
		dqueue.add("Zalak");
		dqueue.add("Satish");
		dqueue.offer("Vinay");
		dqueue.offerFirst("Mrugesh");
		dqueue.addFirst("Zeel");
		
		
		// Add and offer difference: 
		// Add: If array is full, it will throw exception
		// Offer: if arary is full, it will just return false

		// 	Mrugesh,Gautamm, Alex,
		
		
		for(String value : dqueue) {
			System.out.println(value);
		}
		
		System.out.println("-------------");
		
		System.out.println(dqueue.pollLast());
		//System.out.println();
		
		
		
		

	}

}
