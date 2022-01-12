package com.simplilean.sorting;

public class RecursionExample {

	public static void main(String[] args) {
		
		RecursionExample obj = new RecursionExample();
		System.out.println(obj.inception(0));
		
		
		System.out.println(obj.fibo(5));
		

	}
	
	//5! = 5 * 4 * 3* 2 *1
	/* 
	 * 5! = 5 * 4!
	 * 		4 * 3!
	 * 		3 * 2!
	 * 		2 * 1!
	 */
	
	int fibo(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n*fibo(n-1);
	}
	
	// Please consider base condition in the code first
	// Advantage: Helps for task that has repeated nature.
	String inception(int counter) {
		
		if(counter>3) {
			return "Done";
		}
		counter++;
		return counter + inception(counter);
	}

}



