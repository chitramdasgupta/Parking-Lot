package com.chitramdasgupta;

public class ElectricSpot extends Spot {
    private final SpotType spotType = SpotType.ELECTRIC;
    private final ElectricPanel electricPanel = new ElectricPanel();

    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle.isElectric();
    }

    @Override
    public SpotType getSpotType() {
        return spotType;
    }
}
