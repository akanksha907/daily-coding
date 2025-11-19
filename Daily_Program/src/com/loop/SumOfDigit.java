//24. Sum of digits of a number

package com.loop;

public class SumOfDigit {

	public static int calculateSumOfDigits(int number) { 
        int sum = 0; 
        while (number > 0) { 
            int digit = number % 10; // Extract the last digit 
            sum = sum + digit; // Add the digit to sum 
            number = number / 10; // Remove the last digit from number 
        } 
        return sum; 
    }
	
	public static void main(String[] args) { 
        int number = 98765; 
 
        int sumOfDigits = calculateSumOfDigits(number); 
 
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits); 
    } 
 
    


}
