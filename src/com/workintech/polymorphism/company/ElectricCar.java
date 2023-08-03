package com.workintech.polymorphism.company;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String name, String description,double avgKmPerCharge,int batterySize) {
        super(name, description);
        this.batterySize=batterySize;
        this.avgKmPerCharge=avgKmPerCharge;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
