//8. Largest number from 3 number/ given list 

package com.QA;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumber {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		// 1. By using if else condition 
		int num1 = 7, num2 = 9, num3 = 10; 
		if( num1 >= num2 && num1 >= num3) 
		System.out.println(num1 + " is the largest number."); 
		else if (num2 >= num1 && num2 >= num3) 
		System.out.println(num2 + " is the largest number."); 
		else 
		System.out.println(num3 + " is the largest number."); 
		// 2. Using Collections.max() method and ArrayList 
		ArrayList<Integer> x = new ArrayList<>(); 
		x.add(12); 
		x.add(22); 
		x.add(54); 
		System.out.println(Collections.max(x)+ " is the largest number."); 
		} 
}
