package com.chitramdasgupta;

public class Vehicle {
    private final String licensePlate;
    private boolean hasPaid;
    private Ticket ticket;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        this.hasPaid = false;
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
}
