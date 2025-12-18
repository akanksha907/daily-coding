package com.java8;
public class LambdaExample {
	    public static void main(String[] args) {

	        // 1. Lambda with NO parameters
	        Runnable noParam = () -> System.out.println("No parameter lambda");
	        noParam.run();

	        // 2. Lambda with ONE parameter (Square of number)
	        java.util.function.Function<Integer, Integer> oneParam = x -> x * x;
	        System.out.println("Square: " + oneParam.apply(5));

	        // 3. Lambda with MULTIPLE parameters (Addition)
	        java.util.function.BiFunction<Integer, Integer, Integer> multiParam = (a, b) -> a + b;
	        System.out.println("Sum: " + multiParam.apply(10, 20));

	        // 4. Lambda with MULTI-STATEMENT body (with return)
	        java.util.function.Function<Integer, String> multiStatement = n -> {
	            if (n % 2 == 0) {
	                return n + " is Even";
	            } else {
	                return n + " is Odd";
	            } };
	        System.out.println(multiStatement.apply(7));

	        // 5. Lambda with type declaration
	        java.util.function.BiFunction<Integer, Integer, Integer> typedLambda = (Integer a, Integer b) -> a * b;
	        System.out.println("Product: " + typedLambda.apply(4, 6));
	    }}