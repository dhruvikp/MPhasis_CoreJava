package com.simplilearn.constructorDemo;



/**
 * 
 *  Constructor doesn't have return type
 *  Name of constructor must be same as class name
 *  If you do not define constructor, Compiler will generate no-arg consctructor.
 *  If you define any constructor, compiler won't generate noarg constructor automatically
 *  
 * @author dhruviksparikhg
 *
 */
class Vehicle {
	
	private int id; //0
	private String s; //null
	
	static String s2;
	
	// No argument constcuor
	
	Vehicle(int id, String s) {
		
		this.id = id;
		this.s = s;
		System.out.println("Constructor is invoked");
	}
	
	public int getId() {
		return this.id;
	}
	
}


class A {
	
	A() {
		super();
		System.out.println("A is invoked");
	}
}

class B  extends A {
	public B() {
		super();
		System.out.println("B is invoked");
	}
}



class EmpInfo {
	
	int id ;
	String name;
	
	void display() {
		int a = 5;
		System.out.println(this.id+" "+this.name);
	}
	
	public EmpInfo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}

public class ConstructorDemoExample {

	public static void main(String[] args) {
		EmpInfo empInfo = new EmpInfo(1, "Nischith");
		
		empInfo.display();
		//empInfo.toString();
		
		B b = new B();
		
		
	}
}
