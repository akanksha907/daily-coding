//9. Palindrome Number

package com.leetcode.easy;

public class PalindromeNumber {

	    public static boolean isPalindrome(int x) {

	        // Negative numbers and numbers ending with 0 (except 0) cannot be palindrome
	        if (x < 0 || (x % 10 == 0 && x != 0)) {
	            return false;
	        }

	        int revertedNumber = 0;

	        // Reverse half of the number
	        while (x > revertedNumber) {
	            revertedNumber = revertedNumber * 10 + x % 10;
	            x /= 10;
	        }

	        // For even and odd digit numbers
	        return x == revertedNumber || x == revertedNumber / 10;
	    }

	    // ✅ main method for Eclipse testing
	    public static void main(String[] args) {
	        System.out.println(isPalindrome(121));   // true
	        System.out.println(isPalindrome(-121));  // false
	        System.out.println(isPalindrome(10));    // false
	        System.out.println(isPalindrome(12321)); // true
	    }
}

