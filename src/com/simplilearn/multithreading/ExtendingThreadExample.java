package com.simplilearn.multithreading;

public class ExtendingThreadExample extends Thread {

	
	public void run() {
		System.out.println("Thread is running ...");
	}
	
	public static void main(String[] args) {
	
		ExtendingThreadExample t1 = new ExtendingThreadExample();
		
		
		
		t1.start();
				

	}

}
