package com.simplilearn.CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		
		
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Amit");
		queue.add("Dhruvik");
		queue.add("Z");
		queue.add("Alex");
		queue.add("S");
		
		
		System.out.println("==============");
		for(String value : queue) {
			System.out.println(value);
		}
		
		System.out.println("======================");
		
		//Retrieves and remove head of queue , returns null if queue is empty
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		//Retriees (not remove) head of queue., Queue is empty throw exception
		//System.out.println(queue.element());
		
		//Retrieves (not remove) head of queue, Returns null if queue is empty
		System.out.println(queue.peek());
		
		
		
		System.out.println("==============");
		for(String value : queue) {
			System.out.println(value);
		}
		
		
	}

}
