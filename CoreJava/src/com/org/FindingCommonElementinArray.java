package com.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingCommonElementinArray {
    public static void main(String[] args) {
        int arr1[]={4,2,1,3,6};
        int arr2[]={6,7,8,4};

        List<Integer> commonelement =new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    commonelement.add(arr1[i]);
                }
            }
        }
        System.out.println("Common element iss:"+commonelement);

        System.out.println("using another way");
        String[] array1={ "c", "c++", "javascript","python"};
        String[] array2={ "python", "c++","c","java","microservices"};

        List<String> list1=new ArrayList<>(Arrays.asList(array1));
        List<String> list2=new ArrayList<>(Arrays.asList(array2));

List<String > cmnele= list1.stream()
        .filter(list2::contains).collect(Collectors.toList());
        System.out.println(cmnele);
    }
}
