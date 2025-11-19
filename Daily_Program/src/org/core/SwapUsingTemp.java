//4. Swap two numbers (using temp)

package org.core;

import java.util.Scanner;

public class SwapUsingTemp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a= sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		
		System.out.println("Before Swapping ::");
		System.out.println("a::" + a);
		System.out.println("b::" +b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println(" after Swapping:");
		System.out.println("a::"+a);
		System.out.println("b:: "+b);
		
	
	}

}
