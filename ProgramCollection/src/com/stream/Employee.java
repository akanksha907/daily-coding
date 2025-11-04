//How many  male and female employees are there in organization ?

package com.stream;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	
	public Employee(int id, String name, int age, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getGender() {
		return gender;
	}


	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary
				+ "]";
	}

	

	
	
	
}
