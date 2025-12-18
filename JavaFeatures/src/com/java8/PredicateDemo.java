package com.java8;

	import java.util.*;
	import java.util.function.Predicate;

	public class PredicateDemo {
	    public static void main(String[] args) {

	        List<String> names = Arrays.asList("Akshay", "Ram", "Rohit", "Amit");

	        // Predicate: name should start with 'A'
	        Predicate<String> startsWithA = name -> name.startsWith("A");

	        names.stream()
	             .filter(startsWithA)
	             .forEach(System.out::println);
	    }
	}
