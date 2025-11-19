// 36. Copy one array to another

package com.array;

public class CopyOneWArrayToAnother {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5};
	int arr2[]=new int[arr1.length];
	
	for(int i=0;i< arr1.length;i++) {
		arr2[i]=arr1[i];
	}
	
	System.out.println("Copied array");
	for(int x: arr2) {
		System.out.println(x + " ");
	}
}
}
