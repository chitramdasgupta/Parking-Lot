package com.chitramdasgupta;

public class CreditCard extends Payment {
    @Override
    public void process() {
        System.out.println("Processing CreditCard");
    }
}
