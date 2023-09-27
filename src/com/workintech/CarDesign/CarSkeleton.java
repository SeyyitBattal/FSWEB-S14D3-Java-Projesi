package com.workintech.CarDesign;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine is started to work");
        System.out.println("It's name: " + getName());
    }


    public void drive() {
        runEngine();
        System.out.println("You can drive now!");
    }

    protected void runEngine() {
        System.out.println("Engine is working");
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
