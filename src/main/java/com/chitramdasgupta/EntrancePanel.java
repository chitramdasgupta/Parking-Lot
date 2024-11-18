package com.chitramdasgupta;

public class EntrancePanel implements Observer {
    @Override
    public void update(int totalAvailableSpots) {
        if (totalAvailableSpots > 0) {
            System.out.println("Parking available: " + totalAvailableSpots + " spots.");
        } else {
            System.out.println("Parking full. No spots available.");
        }
    }
}
