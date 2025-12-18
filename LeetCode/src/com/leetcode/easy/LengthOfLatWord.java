//58.Length of Last word

package com.leetcode.easy;

public class LengthOfLatWord {

	    public static int lengthOfLastWord(String s) {

	        int length = 0;
	        int i = s.length() - 1;

	        // Skip trailing spaces
	        while (i >= 0 && s.charAt(i) == ' ') {
	            i--;
	        }

	        // Count last word characters
	        while (i >= 0 && s.charAt(i) != ' ') {
	            length++;
	            i--;
	        }

	        return length;
	    }

	    // ✅ main method for Eclipse
	    public static void main(String[] args) {
	        System.out.println(lengthOfLastWord("Hello World"));              // 5
	        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
	        System.out.println(lengthOfLastWord("luffy is still joyboy"));     // 6
	    }
	
}
