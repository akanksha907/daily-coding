package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Akshay", "Rohan"),
                Arrays.asList("Meera", "Sonia")
        );

        // Flatten nested lists into a single list
        List<String> flatList = nestedList.stream()
                                          .flatMap(List::stream)
                                          .collect(Collectors.toList());

        System.out.println("Flattened List: " + flatList);
    }
}



