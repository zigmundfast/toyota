package com.company.car;

import com.company.car.spareParts.*;

public class Camry extends PassengerCar {
    private boolean usb;

    public Camry(String color, int maxSpeed, String gearBox, boolean movement, Wheel[] wheels, Gasoline gasoline, Engine engine, Headlights headlights, Price price, Еlectrics еlectrics, boolean cruise, boolean usb) {
        super(color, maxSpeed, gearBox, movement, wheels, gasoline, engine, headlights, price, еlectrics, cruise);

        this.usb = usb;
    }

    public boolean isUsb() {
        return usb;
    }

    public void setUsb(boolean usb) {
        this.usb = usb;
    }
}