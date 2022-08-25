package com.company.car.CarType;
import com.company.car.spareParts.GearBox;
import com.company.car.StartCarException;
import com.company.car.spareParts.*;

public  abstract class Car {
    private String color;
    private int maxSpeed;
    private GearBox gearBox;
    private boolean movement;
    private double price;

    private Gasoline gasoline;
    private Wheel[] wheels ;
    private Engine engine;
    private Headlights headlights;
    private Еlectrics еlectrics;
    private  CarWheelRadius carWheelRadius;

    public Car(String color, int maxSpeed, GearBox gearBox, boolean movement, double price, Gasoline gasoline,
               Wheel[] wheels, Engine engine, Headlights headlights, Еlectrics еlectrics,CarWheelRadius carWheelRadius) throws StartCarException {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.gearBox = gearBox;
        this.movement = movement;
        this.price = price;
        this.gasoline = gasoline;
        this.wheels = wheels;
        this.engine = engine;
        this.headlights = headlights;
        this.еlectrics = еlectrics;
        this.carWheelRadius=carWheelRadius;
        for (Wheel wheel : wheels) {
            if (wheel.getCarWheelRadius() != carWheelRadius) {
                throw new RuntimeException("the radius of the wheels should be equal " + wheel.getCarWheelRadius());
            }
        }
    }
    public void  start() throws StartCarException {
        if (checkWheels() && gasoline.getLevelGas() >0 && !еlectrics.isBroken() && !engine.isBroken()) {
            this.movement = true;
            System.out.println("Машина начала движение");
        }
        if (!checkWheels()){
            throw new StartCarException("the car has problems with the wheels");
        }
        if (gasoline.getLevelGas() <=0 ) {
            throw new StartCarException("the car has no gasoline");
        }
        if (еlectrics.isBroken()){
            throw new StartCarException("the car has problems with the electrics");
        }
        if (engine.isBroken()){
            throw  new StartCarException("the car has a broken engine");
        }


    }
    public boolean checkWheels() {
        if (wheels.length == 4 ){
            boolean wheelsIsOk = true;
            for (Wheel wheel : wheels) {
                if (wheel.isBroken()) {
                    wheelsIsOk = false;
                    break;
                }
            }
            return wheelsIsOk;
        } else {
            return false;
        }

    }
    public void stop(){
        this.movement = false;
        System.out.println("the car stopped");

    }

    public void headlights(){
        if (!headlights.isBroken()){
            System.out.println("turn on the headlights");
        }
    }

    public void switchWheel(int index, Wheel wheel){
        if (wheel.getCarWheelRadius() == carWheelRadius ) {
            wheels[index] = wheel;
        }
    }

    public Wheel[] getWheels() {
        return wheels;
    }
}



