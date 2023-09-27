package com.workintech.PasificCarCompany;

public class Car {
    private boolean isEngine;
    private int cylinders, wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.isEngine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("the car's engine is starting");
        System.out.println("It's name: " + getName());
    }

    public void accelerate() {
        System.out.println("the car is accelerating");
    }

    public void brake() {
        System.out.println("the car is braking");
    }


    @Override
    public String toString() {
        return "Car{" +
                "isEngine=" + isEngine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }
}
