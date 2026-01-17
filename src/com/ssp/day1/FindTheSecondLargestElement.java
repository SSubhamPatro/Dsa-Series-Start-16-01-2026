package com.ssp.day1;

public class FindTheSecondLargestElement {

	public static void main(String[] args) {
		/*
		 Find the second highest number without sorting.
		Example:
		Input: [12, 35, 1, 10, 34, 1]
		Output: 34
		
		When a bigger number is found:
        Current largest becomes secondLargest 
        New number becomes largest
		*/
		
		int arr[]= {12, 35, 1, 10, 34, 1};
		int largest=Integer.MIN_VALUE;//Store The Max Number //35
		int secondLargest=Integer.MIN_VALUE;//Store The Second Max //34
		
		for(int num:arr) {
			if(num>largest) {
				secondLargest=largest;
				largest=num;	
			}
			else if (num>secondLargest&&num!=largest) {
				secondLargest=num;
			}
		}
		if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("Second Largest Element Not Found");	
		}
		else {
			System.out.println("Second Largest Found "+secondLargest);
		}
		
		
	}

}
