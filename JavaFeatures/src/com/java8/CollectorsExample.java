package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akshay", "Rohan", "Meera", "Rohan");

        // 1️⃣ Collect to List
        List<String> list = names.stream().collect(Collectors.toList());
        System.out.println("List: " + list);

        // 2️⃣ Collect to Set
        Set<String> set = names.stream().collect(Collectors.toSet());
        System.out.println("Set: " + set);

        // 3️⃣ Join elements
        String joined = names.stream().collect(Collectors.joining(", "));
        System.out.println("Joined: " + joined);

        // 4️⃣ Group by length
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + grouped);

        // 5️⃣ Count elements
        long count = names.stream().collect(Collectors.counting());
        System.out.println("Total elements: " + count);
    }
}

