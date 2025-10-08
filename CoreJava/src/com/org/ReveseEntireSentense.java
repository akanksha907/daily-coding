package com.org;

public class ReveseEntireSentense {
    public static void main(String[] args) {

        String str[]= "india is country my".split(" ");
        String ans=" ";
        for(int i=str.length-1;i>=0;i--){
            ans= ans+ str[i]+" ";
        }
        System.out.println(ans.substring(0,ans.length()-1));
    }
}
