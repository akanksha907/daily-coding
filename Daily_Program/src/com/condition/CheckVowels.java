// 15. Check vowel or consonant

package com.condition;

import java.util.Scanner;

public class CheckVowels {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println(" Enter the vowels");
	char ch=sc.next().charAt(0);
	ch=Character.toLowerCase(ch);
	if(ch=='a' || ch =='e' || ch=='i' || ch=='o'  || ch=='u') {
		System.out.println(ch + " is a vowel");
	}
		else if((ch >= 'a' && ch <= 'z')) {
			System.out.println(ch + " is a constant");
		}
	}
	
}
