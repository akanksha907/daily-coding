//40. Find second largest number

package com.array;

import java.util.Arrays;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] arrlist= {3,2,4,1,41,6,5,8,76,98,43,8};
	int num=arrlist.length;
	Arrays.sort(arrlist);
	System.out.println("SecondLargestNumber is::==>"+ arrlist[num-2]);
	
}
}
