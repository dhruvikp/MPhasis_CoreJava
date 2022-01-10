package com.simplilean.datastruture;

public class ArrayRotationExample {

	public static void main(String[] args) {
		
		ArrayRotationExample obj = new ArrayRotationExample();
		int[] arr  = {1,2,3,4,5,6,7};
		
		obj.printArray(arr);
		System.out.println();
		int[] temp = obj.rotateArray(arr, 3);
		obj.printArray(temp);
		
	}
	
	public void printArray(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	
	public int[] rotateArray(int[] num, int k) {
		int n = num.length;
		int[] temp = new int[n];
		
		for(int i=0; i< n ; i++) {
			temp[(i+k)%n] = num[i];
		}
		return temp;
	}
	

}
