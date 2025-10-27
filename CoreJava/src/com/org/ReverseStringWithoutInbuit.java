package com.org;

public class ReverseStringWithoutInbuit {

    public String ReverseString(String inputArray){
       char[] chars=inputArray.toCharArray();
       int left=0, right= chars.length-1;
       while(left < right){
           char temp=chars[left];
           chars[left] = chars[right];
           chars[right]= temp;
           left++;
           right--;
       }
       return new String(chars);
    }

    public static void main(String[] args) {
        ReverseStringWithoutInbuit rs= new ReverseStringWithoutInbuit();
        String name=rs.ReverseString("Akanksha");
        System.out.println("Reverse String is :"+name);
    }
}
