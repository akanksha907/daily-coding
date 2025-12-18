// Lambda Example :: == > 23/11/2025

package com.java8.lambda;


interface Shape{
	void draw();
}


class  Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle class : draw() method ");
	}
	
}

class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Sqaure class : draw() method");
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
	System.out.println("Circle class : draw() method");	
	}
	
}
public class LambdaExample {

	public static void main(String[] args) {
		
	String str= "hello";
	
	Shape rectangle = () -> System.out.println(" Rectangle class : draw() Method");
//	rectangle.draw();
	
	Shape square = () -> System.out.println(" Square class : draw() Method");
//	square.draw();
	
	Shape circle = () -> System.out.println(" Circle class : draw() Method");
//	circle.draw();
	
	print(rectangle);
	print(square);
	print(circle);
	}

	private static void print(Shape shape) {
		// TODO Auto-generated method stub
		shape.draw();
	}
}
