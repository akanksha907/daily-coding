// How can we check if a given string is a palindrome using Java 8 Streams, without explicitly reversing the string ?
// using stream

package com.stream;

import java.util.stream.IntStream;

public class PalindromeCheck {
public static void main(String[] args) {
    System.out.println(isPalindrome("madam"));   // true

    System.out.println(isPalindrome("level"));   // true

    System.out.println(isPalindrome("hello"));   // false

    System.out.println(isPalindrome("racecar")); // true

    System.out.println(isPalindrome("radar"));   // true

}


public static boolean isPalindrome(String str) {

    int n = str.length();

    return IntStream.range(0, n / 2)

            .allMatch(i -> str.charAt(i) == str.charAt(n - i - 1));

}
}

