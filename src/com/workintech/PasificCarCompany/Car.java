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


}
