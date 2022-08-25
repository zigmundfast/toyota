package com.company;

import com.company.car.StartCarException;
import com.company.car.models.Camry;
import com.company.car.spareParts.*;

public class Runner {
    public static void main(String[] args) throws StartCarException {
        Gasoline gasoline = new Gasoline();
        Engine engine = new Engine();
        Еlectrics еlectrics = new Еlectrics();
        Headlights headlights = new Headlights();
        Wheel[] wheels = generateWheels(CarWheelRadius.R17);
        CruiseControl cruiseControl = new CruiseControl();
        Usb usb = new Usb();

        Camry camry = new Camry("black",250, GearBox.AUTOMATIC,false,10_000,gasoline,wheels,engine,
                headlights, еlectrics,CarWheelRadius.R17, cruiseControl,usb);
        camry.onMusic();
        Wheel newWheel = new Wheel(CarWheelRadius.R17);
        System.out.println(camry.getWheels()[0]);
        camry.switchWheel(0,newWheel);
        System.out.println(camry.getWheels()[0]);
    }
    

    public static Wheel[] generateWheels(CarWheelRadius carWheelRadius){
        Wheel[] wheels = new Wheel[4];
        for (int i=0; i<4; i++){
            wheels[i]= new Wheel(carWheelRadius);
        }
        return wheels;
    }
}
