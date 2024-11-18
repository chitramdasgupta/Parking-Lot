package com.chitramdasgupta;

public class Vehicle {
    private final String licensePlate;
    private boolean hasPaid;
    private Ticket ticket;
    private final boolean isHandicappedAccessible;
    private final boolean isElectric;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        this.hasPaid = false;
        this.isHandicappedAccessible = false;
        this.isElectric = false;
    }

    public Vehicle(String licensePlate, boolean hasPaid, Ticket ticket, boolean isHandicappedAccessible, boolean isElectric) {
        this.licensePlate = licensePlate;
        this.hasPaid = hasPaid;
        this.isHandicappedAccessible = isHandicappedAccessible;
        this.isElectric = isElectric;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    public void markAsPaid() {
        this.hasPaid = true;
    }

    public void assignTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public boolean isHandicappedAccessible() {
        return isHandicappedAccessible;
    }

    public boolean isElectric() {
        return isElectric;
    }
}
