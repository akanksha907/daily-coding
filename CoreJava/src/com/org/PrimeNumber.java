package com.org;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=7;
		
		System.out.println("The given numebr is :"+ num);
		int count =0;
		if(num==2)
		{
			System.out.println(num+ "The number is prime");
		}
		else {
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
					count++;
			}
		}
		if(count==2) {
			System.out.println(num  +"The Number is prime");
		}
		else {
			System.out.println(num   + "The number is not prime");
		}
			
	}

}
