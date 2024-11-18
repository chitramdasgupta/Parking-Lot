package com.chitramdasgupta;

public class Ticket {
    private final Vehicle vehicle;
    private final long issuedAt;

    public Ticket(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.issuedAt = System.currentTimeMillis();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public long getIssuedAt() {
        return issuedAt;
    }

    @Override
    public String toString() {
        return "Ticket issued to vehicle: " + vehicle + " at " + issuedAt;
    }
}
