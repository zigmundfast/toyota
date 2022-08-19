package com.company.car;

public class Hiance extends Truck {
    private boolean spareWheel;

    public Hiance() {
    }

    public Hiance(String color, int maxSpeed, String gearBox, boolean movement, boolean frontLeftWheel, boolean frontRightWheel, boolean backLeftWheel, boolean backRightWheel, int capacity) {
        super(color, maxSpeed, gearBox, movement, frontLeftWheel, frontRightWheel, backLeftWheel, backRightWheel, capacity);
    }

    public boolean isSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(boolean spareWheel) {
        this.spareWheel = spareWheel;
    }
}
