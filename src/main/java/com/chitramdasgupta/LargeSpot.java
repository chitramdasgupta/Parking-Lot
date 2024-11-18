package com.chitramdasgupta;

public class LargeSpot extends Spot {
    private final SpotType spotType = SpotType.COMPACT;

    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle instanceof Truck || vehicle instanceof Van || vehicle instanceof Car;
    }

    @Override
    public SpotType getSpotType() {
        return spotType;
    }
}
