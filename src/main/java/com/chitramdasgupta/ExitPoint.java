package com.chitramdasgupta;

public class ExitPoint {
    public boolean isAvailable() {
        return true;
    }

    public void processPayment(Vehicle vehicle, Payment payment) {
        PaymentProcessor.processPayment(vehicle, payment);
    }
}
