package com.chitramdasgupta;

public class ElectricSpot extends Spot {
    private ElectricPanel electricPanel;

    @Override
    protected boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle.isElectric();
    }
}
