package com.org;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str=" $ja!va$&st%ar";

        String s=str.replaceAll("[^A-Za-z0-9]"," ");
        System.out.println(s);
    }
}
