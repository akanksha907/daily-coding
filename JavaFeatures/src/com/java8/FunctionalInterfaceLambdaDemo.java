package com.java8;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);   // Single abstract method
}

public class FunctionalInterfaceLambdaDemo {

    public static void main(String[] args) {

        // Lambda implementing the functional interface

        Operation add = (a, b) -> a + b;
        System.out.println("Addition: " + add.apply(10, 20));

        Operation subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.apply(30, 10));

        Operation multiply = (a, b) -> {
            System.out.println("Multiplying...");
            return a * b;
        };
        System.out.println("Multiplication: " + multiply.apply(5, 4));
    }
}