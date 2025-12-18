// 3. Add two numbers

package com.core;

public class Addition {
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
public static void main(String[] args) 
{
	Addition ad=new Addition();
   int a = 10;
   int b=20 ;
   int c = ad.add(a, b);
   
System.out.println("Value of a is:"+ a);
System.out.println("Value of b is:"+ b);
System.out.println("Addition of two number is:"+ c );
   
}
}
