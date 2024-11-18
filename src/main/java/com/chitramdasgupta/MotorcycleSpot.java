package com.chitramdasgupta;

public class MotorcycleSpot extends Spot {
    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle instanceof Motorcycle;
    }
}
