package com.java8;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30);

        // Consumer: Print each number after adding 5
        Consumer<Integer> addAndPrint = n -> System.out.println(n + 5);

        numbers.forEach(addAndPrint);
    }
}
