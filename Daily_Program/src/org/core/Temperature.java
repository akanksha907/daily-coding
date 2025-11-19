//6. Convert temperature (Celsius ↔ Fahrenheit)

package org.core;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
     System.out.println("Enter temperature in celcius");
     double celcius = sc.nextDouble();
     double fahrenheit= (celcius * 9/5 ) + 32;
     
     System.out.println(" Temperature in fahrenheit::"+ fahrenheit);
	}

}
