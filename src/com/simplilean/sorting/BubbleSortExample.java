package com.simplilean.sorting;

public class BubbleSortExample {

	public static void main(String[] args) {
		BubbleSortExample obj = new BubbleSortExample();

		int[] arr = { 64, 56, 34, 12, 22, 11, 88, 90, 1 };
		obj.printArray(arr);
		obj.bubbleSort(arr);
		obj.printArray(arr);

	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	void bubbleSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
