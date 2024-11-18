package com.chitramdasgupta;

public class Cash extends Payment {
    @Override
    public void process() {
        System.out.println("Processing Cash");
    }
}
