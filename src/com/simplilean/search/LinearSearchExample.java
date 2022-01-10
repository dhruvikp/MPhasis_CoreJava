package com.simplilean.search;

import java.util.Scanner;

public class LinearSearchExample {

	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		System.out.println("Enter element to be searched:");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int searchValue = scanner.nextInt();
			
			int result = LinearSearchExample.linearSearch(arr, searchValue);
			
			if(result == -1) {
				System.out.println("Element not found in an array");
			} else {
				System.out.println("Element found at index "+result+" and the search key is "+arr[result]);
			}
		}
	}
	
	public static int linearSearch(int[] arr, int x) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
