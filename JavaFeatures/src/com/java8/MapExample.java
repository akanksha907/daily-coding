package com.java8;
import java.util.*;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akshay", "Rohan", "Meera");

        // Convert each name to uppercase using map()
        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperNames);
    }
}

