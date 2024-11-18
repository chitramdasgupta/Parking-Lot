package com.chitramdasgupta;

public class SpotFactory {
    public static Spot createSpot(SpotType spotType) {
        return switch (spotType) {
            case COMPACT -> new CompactSpot();
            case ELECTRIC -> new ElectricSpot();
            case HANDICAPPED -> new HandicappedSpot();
            case LARGE -> new LargeSpot();
        };
    }
}
