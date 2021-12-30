package com.simplilearn.operators;

public class OperatorsExample {

	public static void main(String[] args) {
		
		int i = 3;
		
		int a = i++;	//a=3, i=4
		int b = ++i;    //i=4, b=4;

		
		// +,-,*,/,%
		
		//Shift operator: << >> >>>
		
		// << -- Left shift operator:
		// Shifting all bits in a value to left side of specified number of times
		System.out.println(-10 << 2); // 10*(2*1) = 40
			//10*2 = 20
			//20*2 = 40 
		
		//a<<b
		//a*2^b
		
		// >> - Right shift operator
		
		System.out.println(10 >> 1);
		// a/2^b
		
		// >>> - Unsigned Right bit shift operator
		// Sign bit is filled with 0's
		
		System.out.println(10 >>> 1);
		
		
		System.out.println(1 & 1);
		// AND - 1 only if both bets are 1
		
		System.out.println(1 | 1);
		// OR - 1 if any of bit is 1
		
		System.out.println(1 ^ 1);
		// XOR - 1 if two bits are different
		
		
		System.out.println(true && true);
		System.out.println((1==5) && true); // False
		
		System.out.println((1==5) || true); // True
		
		
		
		
		
		
		
	}

}
