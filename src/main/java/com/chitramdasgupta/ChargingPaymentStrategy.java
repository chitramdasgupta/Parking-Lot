package com.chitramdasgupta;

public class ChargingPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFee(int hours) {
        // Example rate
        double chargingRatePerHour = 5.0;
        return hours * chargingRatePerHour;
    }
}
