package com.simplilean.sorting;

public class QuickSortExample {

	public static void main(String[] args) {
		
		QuickSortExample obj = new QuickSortExample();
		int[] arr = { 64, 56, 34, 12, 22, 11, 88, 90, 1 };
		obj.printArray(arr);
		obj.quickSort(arr,0, arr.length-1);
		obj.printArray(arr);
	}
	
	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	int partition(int[] arr, int l, int r) {
		
		
		int pivotElement = arr[r];
		
		int i = l-1;
		
		for(int j=l; j<=r-1; j++) {
			
			if(arr[j] < pivotElement) {
				i++;
				swap(arr, i, j);
			}
		}
		
		swap(arr, i+1, r);
		return i+1;
	}
	
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	void quickSort(int[] arr, int l, int r) {
		
		if(l < r) {
			int piIndex = partition(arr, l, r);
			
			quickSort(arr, l, piIndex-1);
			quickSort(arr, piIndex+1, r);
			
		}
	}

}
