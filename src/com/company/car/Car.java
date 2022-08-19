package com.company.car;
import com.company.car.spareParts.*;

import java.util.Arrays;

public class Car {
    public String color;
    public int maxSpeed;
    public String gearBox;
    public boolean movement;
    public Wheel[] wheels;

    private Gasoline gasoline;
    private Engine engine;
    private Headlights headlights;
    private Price price;
    private Еlectrics еlectrics;


    public Car(String color, int maxSpeed, String gearBox, boolean movement, Wheel[] wheels, Gasoline gasoline, Engine engine, Headlights headlights, Price price, Еlectrics еlectrics) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.gearBox = gearBox;
        this.movement = movement;
        this.wheels = wheels;
        this.gasoline = gasoline;
        this.engine = engine;
        this.headlights = headlights;
        this.price = price;
        this.еlectrics = еlectrics;
    }

    public Car(String color, int maxSpeed, String gearBox, boolean movement, boolean frontLeftWheel, boolean frontRightWheel, boolean backLeftWheel, boolean backRightWheel) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public boolean isMovement() {
        return movement;
    }

    public void setMovement(boolean movement) {
        this.movement = movement;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Gasoline getGasoline() {
        return gasoline;
    }

    public void setGasoline(Gasoline gasoline) {
        this.gasoline = gasoline;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Headlights getHeadlights() {
        return headlights;
    }

    public void setHeadlights(Headlights headlights) {
        this.headlights = headlights;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Еlectrics getЕlectrics() {
        return еlectrics;
    }

    public void setЕlectrics(Еlectrics еlectrics) {
        this.еlectrics = еlectrics;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", gearBox='" + gearBox + '\'' +
                ", movement=" + movement +
                ", wheels=" + Arrays.toString(wheels) +
                ", gasoline=" + gasoline +
                ", engine=" + engine +
                ", headlights=" + headlights +
                ", price=" + price +
                ", еlectrics=" + еlectrics +
                '}';
    }
}



