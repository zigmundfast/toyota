package com.company.car;

import java.util.List;

public class Solara extends PassengerCar {

      private boolean firdge;

    public Solara() {
    }

    public Solara(String color, int maxSpeed, String gearBox, boolean movement, boolean frontLeftWheel, boolean frontRightWheel, boolean backLeftWheel, boolean backRightWheel, boolean firdge) {
        super(color, maxSpeed, gearBox, movement, frontLeftWheel, frontRightWheel, backLeftWheel, backRightWheel);
        this.firdge = firdge;
    }

    public boolean isFirdge() {
        return firdge;
    }

    public void setFirdge(boolean firdge) {
        this.firdge = firdge;
    }

}
