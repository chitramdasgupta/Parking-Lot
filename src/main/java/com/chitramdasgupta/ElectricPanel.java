package com.chitramdasgupta;

public class ElectricPanel {
    public void processChargingPayment(Vehicle vehicle, int hours) {
        PaymentService.processPayment(vehicle, new ChargingPaymentStrategy(), hours);
    }
}
