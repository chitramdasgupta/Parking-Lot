package com.chitramdasgupta;

public class PaymentService {
    public static void processPayment(Vehicle vehicle, PaymentStrategy paymentStrategy, int hours) {
        Payment payment = new Payment(paymentStrategy, hours);
        double totalFee = payment.process();
        System.out.println("Payment of $" + totalFee + " processed for vehicle: " + vehicle.getLicensePlate());
        vehicle.markAsPaid();
    }
}
