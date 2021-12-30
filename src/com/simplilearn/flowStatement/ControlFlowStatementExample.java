package com.simplilearn.flowStatement;

import com.simplilearn.accessSpecifier.*;

public class ControlFlowStatementExample {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		int age = 20;
		
		if(age > 18) {
			System.out.println("Age is greater than 18");
		} else {
			System.out.println("Age is smaller than 18");
		}
		
		// Loopings:
		
		// For loop :  iterate part of program several times, number of iteration is fixed
		// While loop: iterate part of programs several times, number of iteration nis not fixed
		// Do..While loop: similear to while, ensures atleast one time executed.
		
		for(int i=0; i<10; i++) {
			//System.out.println(i);
		}
		
		int i= 100;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int x = 100;
		do {
		System.out.println(x++);	
		} while(x<=10);
		
		
		// Switch statement
		int number = 21;
		
		switch(number) {
		case 10: 
			System.out.println(number); 
			break;

			
		case 20:
			System.out.println(number);
			break;
			
		default:
			System.out.println("Not in 10 or 20");
		}
		
		
		
		// break : loop is immediately terminated, and flow control resumes next statement following the loop
		
		for(int j=1; j<=100; j++) {
			if(j==5) {
				break;
			}
			
			System.out.println(j);
		}
		
		// continue: statement used in loop, when you need to jump to next iteration
		for(int j=1; j<=100; j++) {
			if(j==5 || j==6) {
				continue;
			}
			
			System.out.print(j);
		}
		
	}
}
