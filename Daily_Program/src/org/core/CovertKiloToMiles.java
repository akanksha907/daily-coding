// 7. Convert kilometers to miles

package org.core;

import java.util.Scanner;

public class CovertKiloToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter distance in kilometer");
   double km=sc.nextDouble();
   double miles= km * 0.62;
   System.out.println("distance in miles:" + miles);
		   
	}

}
