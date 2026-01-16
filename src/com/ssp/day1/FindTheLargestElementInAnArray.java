package com.ssp.day1;

public class FindTheLargestElementInAnArray {

	public static void main(String[] args) {
		/*
		 Input: [10, 45, 2, 99, 23]
         Output: 99
		  */
		int arr[]= {10, 45, 2, 99, 23};
		int min=arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(min<arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Max Element Of Array Is: "+min);
	}
}
