package com.chitramdasgupta;

public class InfoPortal {
    public void processPayment(Vehicle vehicle, int hours) {
        PaymentService.processPayment(vehicle, new HourlyPaymentStrategy(), hours);
    }
}
