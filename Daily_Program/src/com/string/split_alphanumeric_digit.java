package com.string;

public class split_alphanumeric_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome234To567Java89Programming0@#!!"; 
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer(), special = new 
		StringBuffer(); 
		for (int i = 0; i < str.length(); i++) {  
		if (Character.isDigit(str.charAt(i))) 
		num.append(str.charAt(i)); 
		else if (Character.isAlphabetic(str.charAt(i))) 
		alpha.append(str.charAt(i)); 
		else 
		special.append(str.charAt(i)); 
		} 
		System.out.println(alpha); 
		System.out.println(num); 
		System.out.println(special); 
		
	}

}
