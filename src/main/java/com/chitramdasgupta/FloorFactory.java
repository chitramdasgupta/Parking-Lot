package com.chitramdasgupta;

import java.util.ArrayList;
import java.util.List;

public class FloorFactory {
    public static Floor createFloor(FloorType type, List<SpotType> spotTypes) {
        InfoPortal infoPortal = new InfoPortal();
        List<Spot> spots = new ArrayList<>();

        for (SpotType spotType : spotTypes) {
            spots.add(SpotFactory.createSpot(spotType));
        }

        return switch (type) {
            case GROUND -> new Floor(type, infoPortal, spots, new ParkingDisplayBoardStrategy());
            case UPPER -> new Floor(type, infoPortal, spots, new FloorDisplayBoardStrategy());
        };
    }
}
