package com.chitramdasgupta;

public class ElectricSpot extends Spot {
    private final SpotType spotType = SpotType.COMPACT;
    private ElectricPanel electricPanel;

    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle.isElectric();
    }

    @Override
    public SpotType getSpotType() {
        return spotType;
    }
}
