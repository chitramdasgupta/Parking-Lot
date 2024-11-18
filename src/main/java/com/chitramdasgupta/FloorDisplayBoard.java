package com.chitramdasgupta;

import java.util.Map;

public class FloorDisplayBoard implements Observer {
    private final Map<SpotType, Integer> availableSpotsByType;

    public FloorDisplayBoard(Map<SpotType, Integer> availableSpotsByType) {
        this.availableSpotsByType = availableSpotsByType;
    }

    @Override
    public void update(int totalAvailableSpots) {
        System.out.println("Floor Display Board Updated:");
        availableSpotsByType.forEach((spotType, count) ->
                System.out.println(spotType + ": " + count + " spots available."));
    }

    public void setAvailableSpotsByType(Map<SpotType, Integer> updatedCounts) {
        availableSpotsByType.clear();
        availableSpotsByType.putAll(updatedCounts);
    }
}
