package com.workintech.CarDesign;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize, cylinders;

    public HybridCar(String name, String description, int batterySize, int cylinders, double avgKmPerLitre) {
        super(name, description);
        this.batterySize = batterySize;
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public boolean equals(Object obj) {
        return (((HybridCar)obj).getDescription().equals(getDescription()));
    }

}
