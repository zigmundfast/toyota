package com.company.car.Factory;

import com.company.car.spareParts.*;

public class DetailFactory {
    private Country country;

    public DetailFactory(Country country) {
        this.country = country;
    }

    public Engine createEngine() {
        return new Engine();
    }

    public Gasoline createGaoline() {
        return new Gasoline(0);
    }

    public Headlights createHeadlights() {
        return new Headlights();
    }

    public MiniFridge createMiniFridge() {
        return new MiniFridge();
    }

    public CruiseControl createCruiseControl(){
        return new CruiseControl();
    }

    public Roof createRoof(){
        return  new Roof();
    }

    public Usb createUsb() {
        return new Usb();
    }

    public Socket1 createSocket1() {
        return new Socket1();
    }

    public static Wheel[] createWheels(CarWheelRadius carWheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel(carWheelRadius);
        }
        return wheels;
    }

    public Wheel createSafeWheel(){
        return new Wheel(createSafeWheel()) ;
    }

    public Country getCountry() {
        return country;
    }
}
