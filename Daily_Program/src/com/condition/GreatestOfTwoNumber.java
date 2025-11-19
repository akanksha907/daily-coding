// 13. Find greatest of 3 numbers

package com.condition;

import java.util.Scanner;

public class GreatestOfTwoNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number");
	int first=sc.nextInt();
	System.out.println("Enter second Number");
	int second=sc.nextInt();
	
	if(first  > second ) {
		System.out.println(first + "is greater");
	}
	else if(second > first ) {
		System.out.println( second  + "is greater ");
	}
	else {
		System.out.println("Both numbers are equals");
	}
}
}
