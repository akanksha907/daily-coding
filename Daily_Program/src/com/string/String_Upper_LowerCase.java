// 44. Convert string to uppercase/lowercase

package com.string;

public class String_Upper_LowerCase {
public static void main(String[] args) {
	String str = "Hello Java";
	String upper= str.toUpperCase();
	String lower= str.toLowerCase();
	
	System.out.println("Original====>"+ str);
	System.out.println("Uppercase===>"+ upper);
	System.out.println("Lowercase===>"+ lower);
}
}
