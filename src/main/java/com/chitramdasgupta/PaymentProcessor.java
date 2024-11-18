package com.chitramdasgupta;

public class PaymentProcessor {
    public static void processPayment(Vehicle vehicle, Payment payment) {
        if (vehicle.hasPaid()) {
            System.out.println("Vehicle has already paid.");
        } else {
            payment.process();
            vehicle.markAsPaid();
            System.out.println("Payment processed successfully.");
        }
    }
}
