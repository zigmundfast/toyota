package com.company.car.CarType;

import com.company.car.spareParts.GearBox;
import com.company.car.StartCarException;
import com.company.car.spareParts.*;

public class Dyna extends  Truck{
    private Socket1 socket;

    public Dyna(String color, int maxSpeed, GearBox gearBox, boolean movement, double price, Gasoline gasoline,
                Wheel[] wheels, Engine engine, Headlights headlights, Еlectrics еlectrics,
                CarWheelRadius carWheelRadius, int maxWeightTaken, Socket1 socket) throws StartCarException {
        super(color, maxSpeed, gearBox, movement, price, gasoline, wheels, engine, headlights,
                еlectrics, carWheelRadius, maxWeightTaken);
        this.socket = socket;
    }

    public void chargePhone(){
        this.socket.chargePhone();
    }
}
