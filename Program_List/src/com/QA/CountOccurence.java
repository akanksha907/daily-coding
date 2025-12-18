//10. count the occurrences of each character?
//Input = "This is an example"; 
//Output = p = 1, a = 2, s = 2, T = 1, e = 2, h = 1, x = 1, i = 2, l = 1, m = 1, n = 1

package com.QA;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {
	public static void main(String[] args) { 
		String str = "This is an example"; 
		HashMap<Character, Integer> count = new HashMap<Character, Integer>(); 
		// convert string to character array 
		char[] arr = str.toCharArray(); 
		// traverse every character and count the Occurrences 
		for (char c : arr) { 
		// filter out white spaces 
		if (c != ' ') { 
		if (count.containsKey(c)) { 
		// if character already traversed, increment it 
		count.put(c, count.get(c) + 1); 
		} else { 
		// if character not traversed, add it to hashmap 
		count.put(c, 1); 
		} 
		} 
		} 
		// traverse the map and print the number of occurences of a character 
		for (Map.Entry entry : count.entrySet()) { 
		System.out.print( entry.getKey() + " = " + entry.getValue()+", "); 
		} 
		} 
}
