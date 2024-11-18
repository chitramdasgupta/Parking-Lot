package com.chitramdasgupta;

public class Payment {
    private final PaymentStrategy paymentStrategy;
    private final int parkingHours;

    public Payment(PaymentStrategy paymentStrategy, int parkingHours) {
        this.paymentStrategy = paymentStrategy;
        this.parkingHours = parkingHours;
    }

    public double process() {
        return paymentStrategy.calculateFee(parkingHours);
    }
}
