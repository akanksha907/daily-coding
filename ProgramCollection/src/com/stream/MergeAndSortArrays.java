package com.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeAndSortArrays {

	    public static void main(String[] args) {

	        // Input arrays

	        Integer[] array1 = {5, 3, 9, 1};

	        Integer[] array2 = {3, 7, 1, 8};


	        // Merge, sort, and find distinct elements

	        Integer[] result = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))

	                                  .distinct()

	                                  .sorted()

	                                  .toArray(Integer[]::new);


	        // Print the result

	        System.out.println("Merged and sorted distinct elements: " + Arrays.toString(result));

	    }

}
