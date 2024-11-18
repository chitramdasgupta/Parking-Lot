package com.chitramdasgupta;

public class MotorcycleSpot extends Spot {
    private final SpotType spotType = SpotType.COMPACT;

    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle instanceof Motorcycle;
    }

    @Override
    public SpotType getSpotType() {
        return spotType;
    }
}
