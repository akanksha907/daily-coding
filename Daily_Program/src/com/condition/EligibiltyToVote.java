// 17. Check eligibility to vote

package com.condition;

import java.util.Scanner;

public class EligibiltyToVote {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age >=18) {
			System.out.println("You are eligible for vote");
		}
		else {
			System.out.println("you are not eligible for vote");
		}
	}

}
