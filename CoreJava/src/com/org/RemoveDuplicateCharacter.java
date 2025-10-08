package com.org;

import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        char[] inputArray={'j','a','y','r','a','j'};

        String result=new String(new String(inputArray)
                .chars()
                .distinct()
                .mapToObj(c->(char) c)
                .collect(Collectors.toList())
                .toString()
                .replaceAll("[,\\[\\]]",", "));
        System.out.println("After Remove Duplicate Character is :"+result);

    }
}
