package com.company.car.models;

import com.company.car.CarType.Truck;
import com.company.car.spareParts.GearBox;
import com.company.car.StartCarException;
import com.company.car.spareParts.*;

public class Hiance extends Truck {
    private Wheel safeWheel;

    public Hiance(String color, int maxSpeed, GearBox gearBox, boolean movement, double price, Gasoline gasoline,
                  Wheel[] wheels, Engine engine, Headlights headlights, Еlectrics еlectrics,
                  CarWheelRadius carWheelRadius, int maxWeightTaken, Wheel safeWheel) throws StartCarException {
        super(color, maxSpeed, gearBox, movement, price, gasoline, wheels, engine, headlights,
                еlectrics, carWheelRadius, maxWeightTaken);
        this.safeWheel = safeWheel;
    }

    public Wheel getSafeWheel() {
        return safeWheel;
    }

    public void setSafeWheel(Wheel safeWheel) {
        this.safeWheel = safeWheel;
    }
}
