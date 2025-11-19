// 12. Check number is positive, negative, zero

package com.condition;

import java.util.Scanner;

public class CheckNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int number = sc.nextInt();
	
	if(number > 0) {
		System.out.println("Number is positive");
	}
	
	else if(number < 0) {
		System.out.println("Number is negative");
	}
	
	else {
		System.out.println("Number is zero");
	}
}
}
