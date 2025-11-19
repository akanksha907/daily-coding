//8. Calculate simple interest

package org.core;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter principal amount");
	double principal= sc.nextDouble();
	System.out.println("Enter the rate of interest");
	double rate= sc.nextDouble();
	System.out.println("Enter the time in year");
	double time=sc.nextDouble();
	
	double SI= (principal * rate * time) /100;
	
	System.out.println("Simple interest is: "+SI);
}
}
