package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Employee> employees = Arrays.asList(
    		 new Employee(1,"akshay",26, "male",90000),
    		 new Employee(2,"jay",   32,  "male",80000),
    		 new Employee(3,"reena", 24, "female",40000),
    		 new Employee(4,"savita",22, "female",65000),
    		 new Employee(5,"abhay", 13, "male",43000),
    		 new Employee(6,"tanuja",19, "female",81000),
    		 new Employee(7,"rohit", 22, "male",22000)
    		 );
    		 
    		 Map<String, Long> genderCount = employees.stream()

    		 .collect(groupingBy(Employee::getGender, counting()));


    		 Map<String, Double> averageSalary = employees.stream()

    		 .collect(groupingBy(Employee::getGender, averagingDouble(Employee::getSalary)));


    		  System.out.println("Gender Count: " + genderCount);

    		  System.out.println("Average Salary: " + averageSalary);
	}

	

}
