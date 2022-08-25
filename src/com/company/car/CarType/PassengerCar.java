package com.company.car.CarType;

import com.company.car.spareParts.GearBox;
import com.company.car.StartCarException;
import com.company.car.spareParts.*;

public abstract class PassengerCar  extends Car {
    private CruiseControl cruiseControl ;

    public PassengerCar(String color, int maxSpeed, GearBox gearBox, boolean movement, double price, Gasoline gasoline,
                        Wheel[] wheels, Engine engine, Headlights headlights, Еlectrics еlectrics,
                        CarWheelRadius carWheelRadius, CruiseControl cruiseControl) throws StartCarException {
        super(color, maxSpeed, gearBox, movement, price, gasoline, wheels, engine, headlights, еlectrics, carWheelRadius);
        this.cruiseControl = cruiseControl;
    }

    public void turnCruiseControl(){
        this.cruiseControl.turn();
    }



}
