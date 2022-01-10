package com.simplilean.sorting;

public class InsertionSortExample {

	public static void main(String[] args) {

		InsertionSortExample obj = new InsertionSortExample();

		int[] arr = { 64, 56, 34, 12, 22, 11, 88, 90, 1 };
		obj.printArray(arr);
		obj.insertionSort(arr);
		obj.printArray(arr);

	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int pickedElement = arr[i];

			int j = i - 1;

			while (j >= 0 && arr[j] > pickedElement) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = pickedElement;

		}
	}
}
