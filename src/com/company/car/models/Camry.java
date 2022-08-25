package com.company.car.models;

import com.company.car.CarType.PassengerCar;
import com.company.car.spareParts.GearBox;
import com.company.car.StartCarException;
import com.company.car.spareParts.*;

public class Camry extends PassengerCar {
    private Usb usb;


    public Camry(String color, int maxSpeed, GearBox gearBox, boolean movement, double price, Gasoline gasoline,
                 Wheel[] wheels, Engine engine, Headlights headlights, Еlectrics еlectrics,
                 CarWheelRadius carWheelRadius, CruiseControl cruiseControl, Usb usb) throws StartCarException {
        super(color, maxSpeed, gearBox, movement, price, gasoline, wheels, engine, headlights, еlectrics,
                carWheelRadius, cruiseControl);
        this.usb = usb;
    }

    public void onMusic(){
        usb.musicOn();
    }



}