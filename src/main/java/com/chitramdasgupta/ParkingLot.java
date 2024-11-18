package com.chitramdasgupta;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final GroundFloor groundFloor;
    private final List<UpperFloor> upperFloors;
    private final List<EntryPoint> entryPoints;
    private final List<ExitPoint> exitPoints;
    private final int capacity;
    private final EntrancePanel entrancePanel;

    public ParkingLot(List<EntryPoint> entryPoints, List<ExitPoint> exitPoints, int capacity, EntrancePanel entrancePanel) {
        this.groundFloor = new GroundFloor();
        this.upperFloors = new ArrayList<>();
        this.entryPoints = entryPoints;
        this.exitPoints = exitPoints;
        this.capacity = capacity;
        this.entrancePanel = entrancePanel;
    }
}
