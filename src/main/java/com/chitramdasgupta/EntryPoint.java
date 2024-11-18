package com.chitramdasgupta;

public class EntryPoint {
    public boolean isAvailable() {
        return true;
    }

    public Ticket issueTicket(Vehicle vehicle) {
        Ticket ticket = new Ticket(vehicle);
        vehicle.assignTicket(ticket);
        return ticket;
    }
}
