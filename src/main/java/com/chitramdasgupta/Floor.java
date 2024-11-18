package com.chitramdasgupta;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Floor {
    private final FloorType type;
    private final InfoPortal infoPortal;
    private final List<Spot> spots;
    private final DisplayBoardStrategy displayBoardStrategy;

    public Floor(FloorType type, InfoPortal infoPortal, List<Spot> spots, DisplayBoardStrategy displayBoardStrategy) {
        this.type = type;
        this.infoPortal = infoPortal;
        this.spots = spots;
        this.displayBoardStrategy = displayBoardStrategy;
    }

    public FloorType getType() {
        return type;
    }

    public int getAvailableSpots() {
        return (int) spots.stream().filter(Spot::isFree).count();
    }

    public Map<SpotType, Integer> getAvailableSpotsByType() {
        Map<SpotType, Integer> counts = new EnumMap<>(SpotType.class);
        for (Spot spot : spots) {
            SpotType spotType = spot.getSpotType();
            counts.put(spotType, counts.getOrDefault(spotType, 0) + (spot.isFree() ? 1 : 0));
        }

        return counts;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Spot spot : spots) {
            if (spot.parkVehicle(vehicle)) {
                return true;
            }
        }

        System.out.println("No suitable spots available for vehicle");
        return false;
    }

    private boolean isSpotSuitableForVehicle(Spot spot, Vehicle vehicle) {
        return true;
    }

    public void vacateSpot(Spot spot) {
        spot.vacate();
    }

    public void displayInfo() {
        displayBoardStrategy.display();
    }
}
