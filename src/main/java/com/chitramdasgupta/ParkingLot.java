package com.chitramdasgupta;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final FloorManager floorManager;
    private final List<EntryPoint> entryPoints;
    private final List<ExitPoint> exitPoints;
    private final int capacity;

    public ParkingLot(List<EntryPoint> entryPoints, List<ExitPoint> exitPoints, int capacity) {
        this.entryPoints = entryPoints;
        this.exitPoints = exitPoints;
        this.capacity = capacity;
        this.floorManager = new FloorManager();
    }

    public void addFloor(FloorType floorType, List<SpotType> spotTypes) {
        Floor floor = FloorFactory.createFloor(floorType, spotTypes);
        floorManager.addFloor(floor);
        notifyObservers();
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Floor floor : floorManager.getFloors()) {
            if (floor.parkVehicle(vehicle)) {
                notifyObservers();
                return true;
            }
        }

        System.out.println("No suitable floors available for parking");
        return false;
    }

    public int getTotalAvailableSpots() {
        return floorManager.getTotalAvailableSpots();
    }

    public void vacateSpot(Spot spot) {
        spot.vacate();
        notifyObservers();
    }

    public void processEntry(Vehicle vehicle) {
        for (EntryPoint entryPoint : entryPoints) {
            if (entryPoint.isAvailable()) {
                Ticket ticket = entryPoint.issueTicket(vehicle);
                System.out.println("Ticket issued: " + ticket);
                return;
            }
        }

        System.out.println("No suitable entry points");
    }

    public void processExit(Vehicle vehicle, Payment payment) {
        for (ExitPoint exitPoint : exitPoints) {
            if (exitPoint.isAvailable()) {
                exitPoint.processPayment(vehicle, vehicle.getTicket().getElapsedHours());
                return;
            }
        }

        System.out.println("No suitable exit points");
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        int totalAvailableSpots = getTotalAvailableSpots();
        for (Observer observer : observers) {
            observer.update(totalAvailableSpots);
        }
    }
}
