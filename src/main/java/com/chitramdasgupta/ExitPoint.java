package com.chitramdasgupta;

public class ExitPoint {
    public boolean isAvailable() {
        return true;
    }

    public void processPayment(Vehicle vehicle, int hours) {
        PaymentService.processPayment(vehicle, new HourlyPaymentStrategy(), hours);
    }
}
