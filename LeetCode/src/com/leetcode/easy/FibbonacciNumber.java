//509. Fibonnaci Number

package com.leetcode.easy;

public class FibbonacciNumber {

	    public static int fib(int n) {

	        if (n == 0) return 0;
	        if (n == 1) return 1;

	        int prev2 = 0; // F(0)
	        int prev1 = 1; // F(1)

	        for (int i = 2; i <= n; i++) {
	            int curr = prev1 + prev2;
	            prev2 = prev1;
	            prev1 = curr;
	        }

	        return prev1;
	    }

	    // ✅ main method for Eclipse testing
	    public static void main(String[] args) {
	        System.out.println(fib(2)); // 1
	        System.out.println(fib(3)); // 2
	        System.out.println(fib(4)); // 3
	    }

}
