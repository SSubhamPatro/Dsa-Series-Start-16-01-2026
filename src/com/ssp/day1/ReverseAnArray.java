package com.ssp.day1;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		/*
		 3️ Reverse an Array
		
		Question:
		Reverse the given array in-place.
		
		Example:
		Input: [1, 2, 3, 4]
		Output: [4, 3, 2, 1]
		  */
		int arr[] = { 1, 2, 3, 4};
		System.out.println("Original Array Is: " + Arrays.toString(arr));
		System.out.println("Reverse Array: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
