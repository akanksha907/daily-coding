package com.core;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccurenceOfEachCharacter {
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
		for (Entry<Character, Integer> entry : count.entrySet()) { 
		System.out.print( entry.getKey() + " = " + entry.getValue()+", "); 
		} 
		} 
}

