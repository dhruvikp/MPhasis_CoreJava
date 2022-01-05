package com.simplilearn.multithreading;



class Customer {

	volatile int current_amount = 10000;
	
	 void test() {
		System.out.println(current_amount);
		
	}

	synchronized void withdraw(int amount1) throws InterruptedException {
		if (current_amount < amount1) {
			System.out.println("Less balance, waiting for deposit");
			this.wait(); //=---> hold next executions
		}

		current_amount = current_amount - amount1;
		System.out.println("Withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit");
		current_amount += amount;
		System.out.println("Deposit complted");
		System.out.println("Notifying all waiting threads");
		this.notify();
	}

}

class WithdrawRunnable implements Runnable {

	Customer customer;

	public WithdrawRunnable(Customer c) {
		this.customer = c;
	}

	@Override
	public void run() {
		try {

			this.customer.withdraw(15000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class DepositRunnable implements Runnable {

	Customer customer;

	public DepositRunnable(Customer c) {
		this.customer = c;
	}

	@Override
	public void run() {
		this.customer.deposit(10000);
	}
}

public class WaitNotifyExample {

	public static void main(String[] args) throws InterruptedException {
		Customer customer = new Customer();
		
		Thread depositThread = new Thread(new DepositRunnable(customer));
		Thread withdrawThread = new Thread(new WithdrawRunnable(customer));
		
		withdrawThread.start();
		Thread.sleep(10000);
		depositThread.start();

	}

}
