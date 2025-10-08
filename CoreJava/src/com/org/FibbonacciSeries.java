// Fibonacci Series in Java without using recursion

package com.org;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int n1=0, n2=1, n3, i,  count =10;
		
		System.out.println(n1+"   "+n2); // printing n1 and n2
		
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(n3+ "" );
			n1=n2;
			n2=n3;
		}
		
	}
}
