// 16. Grade calculation using marks

package com.condition;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter average marks... ");
   int avg= sc.nextInt();
   char grade;
   
   if(avg>=80) {
	   grade='A';
   }
   else
	   if(avg >=60 && avg <80 )
	   {
		   grade ='B';
	   }
	
	else if(avg >= 40 && avg < 60)
	{
		grade ='C';
	}
	else {
		grade= 'D';
	}

   System.out.println(" your grade is:"+ grade);
	}
}
