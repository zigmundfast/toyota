package com.company.Factory;

import com.company.car.spareParts.*;

public class Factory {
    private Country country;
    private String Color;
    private GearBox gearBox;
    private Gasoline gasoline;
    private Engine engine;
    private Headlights headlights;
    private Wheel wheel;

    public Factory() {
    }

    public Factory(Country country, String color, GearBox gearBox, Gasoline gasoline, Engine engine,
                   Headlights headlights, Wheel wheel) {
        this.country = country;
        Color = color;
        this.gearBox = gearBox;
        this.gasoline = gasoline;
        this.engine = engine;
        this.headlights = headlights;
        this.wheel = wheel;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public com.company.Factory.Color getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
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

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "country=" + country +
                ", Color='" + Color + '\'' +
                ", gearBox=" + gearBox +
                ", gasoline=" + gasoline +
                ", engine=" + engine +
                ", headlights=" + headlights +
                ", wheel=" + wheel +
                '}';
    }
}
