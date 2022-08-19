package com.company.car;

import com.company.car.spareParts.*;

public class Truck extends Car{
    private int capacity;
    {
        if(capacity<20){
            System.out.println("nedogruz");
        }
    }

    public Truck(String color, int maxSpeed, String gearBox, boolean movement, Wheel[] wheels, Gasoline gasoline, Engine engine, Headlights headlights, Price price, Еlectrics еlectrics, int capacity) {
        super(color, maxSpeed, gearBox, movement, wheels, gasoline, engine, headlights, price, еlectrics);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
