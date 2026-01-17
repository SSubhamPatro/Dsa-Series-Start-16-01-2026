package com.ssp.day1;

import java.util.Iterator;

public class CheckIfArrayIsSorted {

	public static String isSorted(int[] arr) {
		
		boolean ascendingOrder = true;
        boolean descendingOrder = true;
        
        for(int i =0;i<arr.length-1;i++) {
        	
        	if(arr[i]>arr[i+1]) {
        		ascendingOrder =false;
        	}
        	if(arr[i]<arr[i+1]) {
        		descendingOrder =false;
        	}
        }
        if(ascendingOrder) return "Array Is In Ascending Order";
        if(descendingOrder) return "Array Is In Descending Order";
        return "Array Is Not Sorted";
	}

	public static void main(String[] args) {

		/*
		 Check If Array Is Sorted
		  Question:
		Check whether the array is sorted in ascending order.
		
		Example:
		Input: [1, 2, 3, 4, 5]
		Output: true
		  */
		int arr[] = { 5,3,4,2,1 };
		/*	boolean ascendingOrder = false;
			for (int i = 0; i < arr.length - 1; i++) {
				// 0=1 0+1=1=2
				if (arr[i] > arr[i + 1]) {
					ascendingOrder = true;
				}
			}
		
			if (!ascendingOrder) {
				System.out.println("Array is sorted in ascending order");
			} else {
				System.out.println("Array is NOT sorted");
			}*/
		
		System.out.println(isSorted(arr));
	}

}
