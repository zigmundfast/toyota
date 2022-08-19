package com.company.car;

public class Camry extends PassengerCar {
    private boolean usb;

    public Camry() {
    }

    public Camry(String color, int maxSpeed, String gearBox, boolean movement, boolean frontLeftWheel, boolean frontRightWheel, boolean backLeftWheel, boolean backRightWheel, boolean usb) {
        super(color, maxSpeed, gearBox, movement, frontLeftWheel, frontRightWheel, backLeftWheel, backRightWheel);

        this.usb = usb;
    }

    public boolean isUsb() {
        return usb;
    }

    public void setUsb(boolean usb) {
        this.usb = usb;
    }


}