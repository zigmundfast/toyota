package com.company.car.models;

import com.company.car.CarType.Cabriolet;
import com.company.car.spareParts.GearBox;
import com.company.car.StartCarException;
import com.company.car.spareParts.*;


public class Solara extends Cabriolet {
    private MiniFridge miniFridge;

    public Solara(String color, int maxSpeed, GearBox gearBox, boolean movement, double price, Gasoline gasoline,
                  Wheel[] wheels, Engine engine, Headlights headlights, Еlectrics еlectrics, CarWheelRadius carWheelRadius, CruiseControl cruiseControl, Roof roof, MiniFridge miniFridge) throws StartCarException {
        super(color, maxSpeed, gearBox, movement, price, gasoline, wheels, engine, headlights, еlectrics,
                carWheelRadius, cruiseControl, roof);
        this.miniFridge = miniFridge;
    }
    public void fridge() {
        miniFridge.fridge();
    }
}
