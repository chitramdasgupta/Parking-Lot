package com.chitramdasgupta;

public class HandicappedSpot extends Spot {
    private final SpotType spotType = SpotType.COMPACT;

    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle.isHandicappedAccessible();
    }

    @Override
    public SpotType getSpotType() {
        return spotType;
    }
}
