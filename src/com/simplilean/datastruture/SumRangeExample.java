package com.simplilean.datastruture;

public class SumRangeExample {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		int output = SumRangeExample.sumRange(arr, 1, 3);
		System.out.println(output);
	}

	static int sumRange(int[] arr, int left, int right) {
		int sum = 0;

		for (int i = left; i <= right; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
