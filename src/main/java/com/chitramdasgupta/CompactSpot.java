package com.chitramdasgupta;

public class CompactSpot extends Spot {
    private final SpotType spotType = SpotType.COMPACT;

    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle instanceof Car || vehicle instanceof Motorcycle;
    }

    @Override
    public SpotType getSpotType() {
        return spotType;
    }
}
