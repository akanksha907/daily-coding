//34. Sort array (basic bubble sort)

package com.array;

public class SortArray {
public static void main(String[] args) {
	int arr[]= { 5,1,4,2,8};
	System.out.println("original array..");
	for(int x :arr) {
		System.out.println(x + " ");
	}
	
	for(int i=0; i<arr.length-1;i++) {
		for(int j=0; j < arr.length-1 ; j++) {
			if(arr[j] > arr[j +1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]= temp;
			}
		}
	}
	System.out.println("\nsorted array:");
	for(int x:arr) {
		System.out.println(x + " ");
	}
}
}
