package com.company.car.CarType;

import com.company.car.spareParts.GearBox;
import com.company.car.StartCarException;
import com.company.car.spareParts.*;

public abstract class Truck extends Car {
    private int maxWeightTaken;

    public Truck(String color, int maxSpeed, GearBox gearBox, boolean movement, double price, Gasoline gasoline,
                 Wheel[] wheels, Engine engine, Headlights headlights, Еlectrics еlectrics,
                 CarWheelRadius carWheelRadius, int maxWeightTaken) throws StartCarException {
        super(color, maxSpeed, gearBox, movement, price, gasoline, wheels, engine, headlights,
                еlectrics, carWheelRadius);
        this.maxWeightTaken = maxWeightTaken;
    }

    public int getMaxWeightTaken() {
        return maxWeightTaken;
    }

}
