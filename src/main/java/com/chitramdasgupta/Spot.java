package com.chitramdasgupta;

public abstract class Spot {
    private boolean isFree;

    public Spot() {
        this.isFree = true;
    }

    public boolean isFree() {
        return isFree;
    }

    // Template method
    public boolean parkVehicle(Vehicle vehicle) {
        if (isFree() && isSuitableForVehicle(vehicle)) {
            occupy();
            System.out.println("Vehicle parked in " + this.getClass().getSimpleName());
            return true;
        }
        return false;
    }

    // Hook method to be implemented by subclasses
    protected abstract boolean isSuitableForVehicle(Vehicle vehicle);

    protected void occupy() {
        if (!isFree) throw new IllegalStateException("Spot is already occupied");
        isFree = false;
    }

    public void vacate() {
        if (isFree) throw new IllegalStateException("Spot is already free");
        isFree = true;
    }
}
