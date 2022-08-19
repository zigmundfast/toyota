package com.company.car;

import com.company.car.spareParts.*;

public class Hiance extends Truck {
    private boolean spareWheel;


    public Hiance(String color, int maxSpeed, String gearBox, boolean movement, Wheel[] wheels, Gasoline gasoline, Engine engine, Headlights headlights, Price price, Еlectrics еlectrics, int capacity, boolean spareWheel) {
        super(color, maxSpeed, gearBox, movement, wheels, gasoline, engine, headlights, price, еlectrics, capacity);
        this.spareWheel = spareWheel;
    }

    public boolean isSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(boolean spareWheel) {
        this.spareWheel = spareWheel;
    }
}
