//11. Check number is even or odd

package com.condition;

import java.util.Scanner;

public class EvenOddd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number:");
	int n1= sc.nextInt();
	if(n1%2==0) {
		System.out.println("GIven number is even");
	}
	else {
		System.out.println("Given number is odd");
	}
	
	
}
}
