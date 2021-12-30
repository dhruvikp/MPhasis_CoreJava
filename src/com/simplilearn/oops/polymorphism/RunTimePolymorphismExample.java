package com.simplilearn.oops.polymorphism;

class Vehicle {
	
	void run() {
		System.out.println("Vehicle is running");
	}
}


class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running");
	}
}

public class RunTimePolymorphismExample {

	public static void main(String[] args) {
		/*Bike bike = new Bike();
		bike.run();
		
		Vehicle v = new Vehicle();
		v.run();*/
		
		// Note: Parent can refer instance of child class
		Vehicle v1 = new Bike();
		v1.run();
		
		
	}
}
