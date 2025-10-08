package com.org;

public class PrintDuplicateCharacter {
    public static void main(String[] args) {
        String str="Akanksha";
        char[] inputArray=str.toCharArray();
        System.out.println("String is :"+str);
        System.out.println("duplicate character is:");
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(inputArray[i]==inputArray[j]){
                    System.out.println(inputArray[j]+" ");
                    break;
                }
            }
        }
    }
}
