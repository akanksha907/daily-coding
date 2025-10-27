package com.org;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str="Reverse each word in sentence ";
        String words[]= str.split("\s");
        String reverseWord="";

        for(String w:words) {
            StringBuffer sb = new StringBuffer(w);
            sb.reverse();
            reverseWord = reverseWord + sb.toString() + "";
        }
            System.out.println("reverse each word in string:"+ reverseWord.trim());
    }
}
