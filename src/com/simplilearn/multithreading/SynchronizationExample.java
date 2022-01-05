package com.simplilearn.multithreading;

class Table extends Object{

	void printTable(int n) {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

class MyThread1 implements Runnable {

	Table t;

	public MyThread1(Table t) {
		this.t = t;

	}

	@Override
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 implements Runnable {

	Table t;

	public MyThread2(Table t) {
		this.t = t;

	}

	@Override
	public void run() {
		t.printTable(6);
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		Table table = new Table();

		MyThread1 mythread1 = new MyThread1(table);
		MyThread2 myThread2 = new MyThread2(table);

		Thread t1 = new Thread(mythread1);
		Thread t2 = new Thread(myThread2);

		t1.start();
		t2.start();

	}

}
