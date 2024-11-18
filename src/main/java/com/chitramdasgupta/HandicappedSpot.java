package com.chitramdasgupta;

public class HandicappedSpot extends Spot {
    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle.isHandicappedAccessible();
    }
}
