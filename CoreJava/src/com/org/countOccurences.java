package com.org;

import java.util.HashMap;
import java.util.Map;

public class countOccurences {
    public static void main(String[] args) {
        String str="akanksha";
        HashMap<Character, Integer> count= new HashMap<Character,Integer>();
        char[] carr=str.toCharArray();
        for(char c: carr){
            if(c!=' '){
                if(count.containsKey(c)){
                    count.put(c, count.get(c)+1);
                }
                else{
                    count.put(c,1);
                }
            }
        }
        for(Map.Entry entry: count.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
