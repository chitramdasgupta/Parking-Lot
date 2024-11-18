package com.chitramdasgupta;

import java.util.List;

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

    public void displayInfo() {
        displayBoardStrategy.display();
    }
}
