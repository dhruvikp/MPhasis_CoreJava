package com.simplilean.search;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearchExample {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 12, 15 };

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter element to search:");
			int key = sc.nextInt();
		
			int result = exponentialSearch(arr, arr.length, key);
			
			if(result <0) {
				System.out.println("Element not found in array");
			} else {
				System.out.println("Element found in array at index "+result);
			}
		}

	}
	
	
	static int exponentialSearch(int[] arr, int n, int x) {
		
		
		if(arr[0] == x) {
			return 0;
		}
		
		int i=1;
		while(i < n && arr[i] <= x) {
			i = i*2;
		}
		
		return Arrays.binarySearch(arr, i/2, Math.min(i, n), x);
		
		
	}

}
