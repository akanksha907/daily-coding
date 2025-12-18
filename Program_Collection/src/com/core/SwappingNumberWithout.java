

// 1.swap two number without using the third variable

package com.core;

public class SwappingNumberWithout {

	public void swapNumber(int a, int b) {
		System.out.println("Before Swapping number of a and b is: "+   "a = "+ " "+ a + " b= "+" "+ b);
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("After Swapping number of a and b is: "+  "a = "+ " "+ a + "  b= "+" "+b);
	}
	public static void main(String[] args) {
		SwappingNumberWithout sw= new SwappingNumberWithout();
		sw.swapNumber(10, 20);
	}
}
