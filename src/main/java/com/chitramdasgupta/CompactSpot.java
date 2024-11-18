package com.chitramdasgupta;

public class CompactSpot extends Spot {
    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle instanceof Car || vehicle instanceof Motorcycle;
    }
}
