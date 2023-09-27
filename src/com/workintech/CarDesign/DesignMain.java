package com.workintech.CarDesign;

public class DesignMain {
    public static void main(String[] args) {
        CarSkeleton car1 = new CarSkeleton("PORSCHE", "icten yanmali");
        car1.startEngine();
        car1.drive();
        System.out.println("\n");
        CarSkeleton car2 = new ElectricCar("TESLA", "Elektrikli", 600, 500);
        car2.startEngine();
        car2.drive();
        System.out.println("\n");
        CarSkeleton car3 = new HybridCar("TOYATA", "Hibrit", 500, 4, 300);
        car3.startEngine();
        car3.drive();
        System.out.println("\n");
        CarSkeleton car4 = new HybridCar("KIA", "Hibrit", 400, 5, 400);
        car4.startEngine();
        car4.drive();

    }
}
