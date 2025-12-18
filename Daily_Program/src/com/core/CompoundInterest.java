// 9. Calculate compound interest

package com.core;

import java.util.Scanner;

public class CompoundInterest {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter principal amount");
			double principal= sc.nextDouble();
			System.out.println("Enter the rate of interest");
			double rate= sc.nextDouble();
			System.out.println("Enter the time in year");
			double time=sc.nextDouble();
			
			double amount= principal * Math.pow(1+ rate / 100, time);
			double compoundInterest=amount - principal;
			
			System.out.println("CompundInterest is :"+compoundInterest);
			System.out.println("Amount is:"+amount);
			
	}

}
