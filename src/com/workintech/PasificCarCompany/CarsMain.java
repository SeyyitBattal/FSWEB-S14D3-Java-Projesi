package com.workintech.PasificCarCompany;

public class CarsMain {
    public static void main(String[] args) {
        Car car = new Car(8, "Supraaa");
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println("\n");
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
        System.out.println("\n");
        Car ford = new Ford(6, "Mustang 1969");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
        System.out.println("\n");
        Car holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();

    }
}
