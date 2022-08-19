package com.company.car;

import com.company.car.spareParts.*;

public class Cabriolet extends PassengerCar {
    private boolean upDownRoof;

    public Cabriolet(String color, int maxSpeed, String gearBox, boolean movement, Wheel[] wheels, Gasoline gasoline, Engine engine, Headlights headlights, Price price, Еlectrics еlectrics, boolean cruise) {
        super(color, maxSpeed, gearBox, movement, wheels, gasoline, engine, headlights, price, еlectrics, cruise);
    }
//
//    public Cabriolet(boolean cruise) {
//        super(cruise);
//    }
//
//
//    public boolean isUpDownRoof() {
//        return upDownRoof;
//    }
//
//    public void setUpDownRoof(boolean upDownRoof) {
//        this.upDownRoof = upDownRoof;
//    }
}
