package com.ssp.day1;

public class FindTheMinimumElementInAnArray {

	public static void main(String[] args) {

		int arr[]= {10, 45, 2, 99, 23};
         
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max>arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Min Element Of The Array: "+max);
	}

}
