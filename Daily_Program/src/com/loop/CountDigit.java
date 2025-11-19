//28. Count number of digits

package com.loop;


public class CountDigit {
public static void main(String[] args) {
	 long num=23456789;
	 int count=0, num2=234567;
	 while(num!=0) {
		 num=num/10;
		 count++;
	 }
	 System.out.println("Number of Digit:"+count);
}
}
