//Reverse a numbers and Number is Palindrome or Not.
// Input = 12321 
// Output =12321 

package com.QA;


public class ReverseNumber {

	public static void main(String[] args) {
	
		int num=12321;
		int rev =0;
		int temp= num;
		int rem;
		while(num >0 )
		{
			rem = num %10;
			rev = (rev * 10) + rem;
			num = num /10;
		}
	
		System.out.println("Reverse Number is----> "+ rev);
		
		if( rev == temp)
		{
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
	
}
