package com.chitramdasgupta;

public class LargeSpot extends Spot {
    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle instanceof Truck || vehicle instanceof Van || vehicle instanceof Car;
    }
}
