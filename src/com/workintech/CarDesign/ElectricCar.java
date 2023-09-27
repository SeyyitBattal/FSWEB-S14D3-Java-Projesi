package com.workintech.CarDesign;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public boolean equals(Object obj) {
        return (((ElectricCar)obj).getDescription().equals(getDescription()));
    }


}
