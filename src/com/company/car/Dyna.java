package com.company.car;

import com.company.car.spareParts.*;

public class Dyna extends Truck {
    private boolean socket;

    public Dyna(String color, int maxSpeed, String gearBox, boolean movement, Wheel[] wheels, Gasoline gasoline, Engine engine, Headlights headlights, Price price, Еlectrics еlectrics, int capacity, boolean socket) {
        super(color, maxSpeed, gearBox, movement, wheels, gasoline, engine, headlights, price, еlectrics, capacity);
        this.socket = socket;
    }

    public boolean isSocket() {
        return socket;
    }

    public void setSocket(boolean socket) {
        this.socket = socket;
    }
}
