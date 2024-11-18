package com.chitramdasgupta;

import java.util.List;

public class ParkingLot {
    private final FloorManager floorManager;
    private final List<EntryPoint> entryPoints;
    private final List<ExitPoint> exitPoints;
    private final int capacity;
    private final EntrancePanel entrancePanel;

    public ParkingLot(List<EntryPoint> entryPoints, List<ExitPoint> exitPoints, int capacity, EntrancePanel entrancePanel) {
        this.entryPoints = entryPoints;
        this.exitPoints = exitPoints;
        this.capacity = capacity;
        this.entrancePanel = entrancePanel;
        this.floorManager = new FloorManager();
    }

    public void addFloor(FloorType floorType) {
        Floor floor = FloorFactory.createFloor(floorType);
        floorManager.addFloor(floor);
    }

    public int getTotalAvailableSpots() {
        return floorManager.getTotalAvailableSpots();
    }

    public void processEntry(Vehicle vehicle) {
        for (EntryPoint entryPoint : entryPoints) {
            if (entryPoint.isAvailable()) {
                Ticket ticket = entryPoint.issueTicket(vehicle);
                System.out.println("Ticket issued: " + ticket);
                return;
            }
        }

        System.out.println("No entry points available");
    }

    public void processExit(Vehicle vehicle, Payment payment) {
        for (ExitPoint exitPoint : exitPoints) {
            if (exitPoint.isAvailable()) {
                exitPoint.processPayment(vehicle, payment);
                return;
            }
        }

        System.out.println("No exit points available");
    }
}
