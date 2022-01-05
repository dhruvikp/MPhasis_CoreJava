package com.simplilearn.multithreading;

class TestSleep implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			try {
				Thread.sleep(1000);
			
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
}

class TestSleep1 implements Runnable {

	@Override
	public void run() {
		for(int i=51; i<=100; i++) {
			try {
				
				Thread.sleep(1000);
			
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
}

public class SleepExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new TestSleep());
		Thread t2 = new Thread(new TestSleep1());
		
		
		t1.start();
		
		t1.join();

		t2.start();
		// Join mehod waits for thread to die. It causes currently running thread to stop executing until thread it joins complets its task.
		

	}

}
