package com.workintech.polymorphism.company;

public class CompanyMain {
    public static void main(String[] args) {
        CarSkeleton car1 = new ElectricCar("Tesla", "Açıklama", 100, 10);
        CarSkeleton car2 = new GasPoweredCar("Mercedes", "Açıklama", 00.8, 4);

        car1.drive();
        car2.drive();
    }
}
