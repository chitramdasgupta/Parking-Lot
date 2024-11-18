package com.chitramdasgupta;

import java.util.ArrayList;
import java.util.List;

public class FloorFactory {
    public static Floor createFloor(FloorType type) {
        InfoPortal infoPortal = new InfoPortal();
        List<Spot> spots = new ArrayList<>();

        return switch (type) {
            case GROUND -> new Floor(type, infoPortal, spots, new ParkingDisplayBoardStrategy());
            case UPPER -> new Floor(type, infoPortal, spots, new FloorDisplayBoardStrategy());
        };
    }
}
