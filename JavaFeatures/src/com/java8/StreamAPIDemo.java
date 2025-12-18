package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akshay", "Rohan", "Meera", "Rohan");

        // 1️⃣ Filter names starting with 'R' and collect to List
        List<String> rNames = names.stream()
                .filter(name -> name.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println("Names starting with R: " + rNames);

        // 2️⃣ Convert names to uppercase and print
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 3️⃣ Sort names and collect
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

        // 4️⃣ Distinct names
        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Names: " + distinctNames);

        // 5️⃣ Count names with length > 5
        long count = names.stream()
                .filter(name -> name.length() > 5)
                .count();
        System.out.println("Count of names with length > 5: " + count);
    }}

