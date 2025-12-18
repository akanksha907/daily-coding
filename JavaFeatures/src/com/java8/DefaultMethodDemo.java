package com.java8;

interface Vehicle {
    void start();  // abstract method

    default void stop() {  // default method
        System.out.println("Vehicle stopped");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();   // calls implemented abstract method
        car.stop();    // calls default method from interface
    }
}

