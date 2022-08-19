package com.company.car;

import com.company.car.spareParts.*;

import java.util.List;

public class Solara extends PassengerCar {

      private boolean firdge;

    public Solara(String color, int maxSpeed, String gearBox, boolean movement, Wheel[] wheels, Gasoline gasoline, Engine engine, Headlights headlights, Price price, Еlectrics еlectrics, boolean cruise, boolean firdge) {
        super(color, maxSpeed, gearBox, movement, wheels, gasoline, engine, headlights, price, еlectrics, cruise);

        this.firdge = firdge;
    }

    public boolean isFirdge() {
        return firdge;
    }

    public void setFirdge(boolean firdge) {
        this.firdge = firdge;
    }
}
