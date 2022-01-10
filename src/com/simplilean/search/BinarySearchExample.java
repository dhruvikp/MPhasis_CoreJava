package com.simplilean.search;

import java.util.Scanner;

public class BinarySearchExample {

	public static void main(String[] args) {

		int[] arr = { 3, 6, 9, 12, 15 };

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter element to search:");
			int key = sc.nextInt();
		
			binarySearch(arr, 0, key, arr.length);
		}
		

	}

	static void binarySearch(int[] arr, int start, int key, int end) {

		int mid = (start + end) / 2;

		while (start <= end) {

			if (arr[mid] < key) {
				start = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index:" + mid);
				break;
			} else {
				end = mid - 1;
			}
			
			mid  = (start+end)/2;
		}

		if (start > end) {
			System.out.println("Element not found in an array");
		}
	}
}
