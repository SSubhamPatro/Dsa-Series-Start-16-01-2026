package com.ssp.day2;

public class RemoveDuplicateElements {
	
	/*Remove Duplicate Elements
	
	Question:
	Remove duplicate values from an array.
	
	Example:
	Input: [1, 2, 2, 3, 4, 4]
	Output: [1, 2, 3, 4]*/

	public static void removeElement(int []arr) {
   
		
		
		for(int i=0;i<arr.length;i++) {
			 boolean isDuplicate=false;
	            // check if current element appeared before

			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1, 2, 2, 3, 4, 4};
		removeElement(arr);
	}

}
