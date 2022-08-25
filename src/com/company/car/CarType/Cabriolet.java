package com.company.car.CarType;

import com.company.car.spareParts.GearBox;
import com.company.car.StartCarException;
import com.company.car.spareParts.*;

public abstract class Cabriolet extends PassengerCar {
    private  Roof roof;


    public Cabriolet(String color, int maxSpeed, GearBox gearBox, boolean movement, double price, Gasoline gasoline,
                     Wheel[] wheels, Engine engine, Headlights headlights, Еlectrics еlectrics,
                     CarWheelRadius carWheelRadius, CruiseControl cruiseControl, Roof roof) throws StartCarException {
        super(color, maxSpeed, gearBox, movement, price, gasoline, wheels, engine, headlights, еlectrics,
                carWheelRadius, cruiseControl);
        this.roof = roof;
    }

    public void turnRoof (){
        roof.turn();
    }
}
