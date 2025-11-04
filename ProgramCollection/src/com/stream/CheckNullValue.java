// using stream
// 

package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckNullValue {
	  public static void main(String[] args) {

	        List<String> strings = new ArrayList<>();

	        strings.add("one");

	        strings.add(null);

	        strings.add("two");

	        strings.add(null);

	        strings.add("three");


	        List<String> filteredStrings = strings.stream()

	                                              .filter(s -> s != null)

	                                              .collect(Collectors.toList());


	        System.out.println(filteredStrings);

	    }
}
