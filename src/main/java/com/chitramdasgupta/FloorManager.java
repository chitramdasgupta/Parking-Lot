package com.chitramdasgupta;

import java.util.ArrayList;
import java.util.List;

public class FloorManager {
    private final List<Floor> floors;

    public FloorManager() {
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public int getTotalAvailableSpots() {
        return floors.stream()
                .mapToInt(Floor::getAvailableSpots)
                .sum();
    }

    public void displayAllFloorInfo() {
        floors.forEach(Floor::displayInfo);
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
