package ru.courcehb.c8.oop.jv44;

public class Car {
    String carBrand;
    String carModel;
    int carCapacity;
    int carYearOfManufacture;

    public Car(String carBrand, String carModel, int carCapacity, int carYearOfManufacture) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carCapacity = carCapacity;
        this.carYearOfManufacture = carYearOfManufacture;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car otherCar = (Car) obj;
            return this.carModel.equals(otherCar.carModel) && this.carYearOfManufacture == carYearOfManufacture;
        }
        return false;
    }
}