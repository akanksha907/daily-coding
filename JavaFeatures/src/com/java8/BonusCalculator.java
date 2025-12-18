package com.java8;
import java.util.function.Function;

public class BonusCalculator {
    public static void main(String[] args) {

        Function<Integer, Integer> addBonus = salary -> salary + 2000;

        System.out.println(addBonus.apply(10000));  // 12000
    }
}
