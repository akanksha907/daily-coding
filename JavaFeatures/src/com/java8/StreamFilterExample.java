package com.java8;
import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        // Filter numbers greater than 20
        List<Integer> filtered = numbers.stream()
                                        .filter(n -> n > 20)
                                        .collect(Collectors.toList());
        System.out.println("Numbers greater than 20: " + filtered);

        // Filter even numbers and print directly
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }}

