//14. How to print duplicate characters from the string? 
//Input = "apple is fruit"; 
//Output = p i 

package com.QA;

public class DuplicateCharacter {
	public static void main(String[] args) { 
		String str = "apple is fruit"; 
		char[] carray = str.toCharArray(); 
		System.out.println("The string is:" + str); 
		System.out.print("Duplicate Characters in above string are: "); 
		for (int i = 0; i < str.length(); i++) { 
		for (int j = i + 1; j < str.length(); j++) { 
		if (carray[i] == carray[j]) { 
		System.out.print(carray[j] + ""); 
		break; 
		} 
		} 
		} 
		} 
}
