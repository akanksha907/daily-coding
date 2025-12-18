//13.Java program to implement hashcode and equals

package com.array;

import java.util.Objects;

public class HashcodeDemo {
	
	private int id;
	private String name;
	
	public HashcodeDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	 // hashCode method 
    @Override 
    public int hashCode() { 
        return Objects.hash(id, name); 
    } 
 
    // equals method 
    @Override 
    public boolean equals(Object obj) { 
        if (this == obj) 
            return true; 
        if (obj == null || getClass() != obj.getClass()) 
            return false; 
        HashcodeDemo student = (HashcodeDemo) obj; 
        return id == student.id && Objects.equals(name, student.name); 
    } 
	
    public static void main(String[] args) {
    	 
         HashcodeDemo student1 = new HashcodeDemo(1, "Alice"); 
         HashcodeDemo student2 = new HashcodeDemo(2, "Bob"); 
         HashcodeDemo student3 = new HashcodeDemo(1, "Alice"); 
  
         // Testing equals method 
         System.out.println("student1.equals(student2): " + 
        		 student1.equals(student2)); // Output: false 
         System.out.println("student1.equals(student3): " + 
 student1.equals(student3)); // Output: true 
  
         // Testing hashCode method 
         System.out.println("Hashcode of student1: " + student1.hashCode()); 
         System.out.println("Hashcode of student2: " + student2.hashCode()); 
         System.out.println("Hashcode of student3: " + student3.hashCode()); 
	}
	

}
