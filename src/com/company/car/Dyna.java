package com.company.car;

public class Dyna extends Truck {
    private boolean socket;

    public Dyna() {
     }

    public Dyna(String color, int maxSpeed, String gearBox, boolean movement, boolean frontLeftWheel, boolean frontRightWheel, boolean backLeftWheel, boolean backRightWheel, int capacity, boolean socket) {
        super(color, maxSpeed, gearBox, movement, frontLeftWheel, frontRightWheel, backLeftWheel, backRightWheel, capacity);
        this.socket = socket;
    }

    public boolean isSocket() {
        return socket;
    }

    public void setSocket(boolean socket) {
        this.socket = socket;
    }
}
