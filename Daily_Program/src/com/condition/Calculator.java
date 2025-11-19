//18. Calculator using switch case


package com.condition;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number:");
	double num1= sc.nextDouble();
	
	System.out.println("Enter second number");
	double num2= sc.nextDouble();
	
	System.out.println(" Choose operation : + , - , * , / ");
	char op=sc.next().charAt(0);
	
	switch (op) {
	case '+':
	System.out.println("Result = "+( num1 + num2) );
	break;
	
	case '-':
	System.out.println("Result =" + ( num1 - num2));
	break;
	
	case '*' :
	System.out.println("Result=" + ( num1 * num2));
	break;
	
	case '/' :
	System.out.println(" Result" +(num1 / num2 ));
	break;
}
}
}
