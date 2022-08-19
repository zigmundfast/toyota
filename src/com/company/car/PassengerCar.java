package com.company.car;

import com.company.car.spareParts.*;

public class PassengerCar  extends Car{
    private boolean cruise ;

    public PassengerCar(String color, int maxSpeed, String gearBox, boolean movement, Wheel[] wheels, Gasoline gasoline, Engine engine, Headlights headlights, Price price, Еlectrics еlectrics, boolean cruise) {
        super(color, maxSpeed, gearBox, movement, wheels, gasoline, engine, headlights, price, еlectrics);
        this.cruise = cruise;
    }

    public boolean isCruise() {
        return cruise;
    }

    public void setCruise(boolean cruise) {
        this.cruise = cruise;
    }
}
