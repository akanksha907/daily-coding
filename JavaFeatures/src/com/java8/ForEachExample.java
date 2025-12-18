package com.java8;
import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Akshay", "Rohan", "Meera");

        // Using lambda - forEach
        names.forEach(name -> System.out.println(name));

        // Using method reference
        names.forEach(System.out::println);
    }
}

