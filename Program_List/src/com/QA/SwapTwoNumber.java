//Swap two numbers  
//Input:  a = 100, b= 200; 
// Output: a = 200, b= 100;

package com.QA;

public class SwapTwoNumber {
	
	public void swapNumber(int a, int b) {
		
		System.out.println("before Swapping number value of A  is--> "+ a + "\n "+ "Value of B is--->"+ " "+ b);
		a= a+ b;
		b= a-b;
		a=a-b;
		  System.out.println("*********\n************");
		System.out.println("After Swapping number value of A  is---> "+ a + "\n "+ "Value of B is---->"+ " "+ b);
		
	}
	public static void main(String[] args) {
		int a = 100; 
		int b= 200;
		
		System.out.println("Using two variable");
		SwapTwoNumber sn = new SwapTwoNumber();
	    sn.swapNumber(a, b);
	    
	    System.out.println("*********\n************");
		System.out.println("Using three variable");
		// 1. Swapping using three Variables 
		int temp = a; 
		a = b; 
		b = temp; 
		System.out.println("After swapping, a = " + a + " and b = " + b); 
	
		System.out.println("*********\n************");
		System.out.println("Swapping using XOR"); 
		// 3. Swapping a and b using XOR 
		a = a ^ b; 
		b = a ^ b; 
		a = a ^ b; 
		System.out.println("After swapping, a = " + a + " and b = " + b); 
		
	
		
	}

}
