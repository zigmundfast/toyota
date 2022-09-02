package com.company.car.Factory;

import com.company.car.StartCarException;
import com.company.car.models.Camry;
import com.company.car.models.Hiance;
import com.company.car.models.Solara;
import com.company.car.spareParts.*;

import static com.company.car.spareParts.CarWheelRadius.R16;
import static com.company.car.spareParts.CarWheelRadius.R17;

public class AssemblyCar {
    private  Country country;
    private DetailFactory detailFactory;

    public AssemblyCar(Country country, DetailFactory detailFactory) {
        this.country = country;
        this.detailFactory = detailFactory;
    }
    public Camry createCamry(String color, double price) throws StartCarException {
        Engine engine = detailFactory.createEngine();
        Gasoline gaoline = detailFactory.createGaoline();
        Headlights headlights = detailFactory.createHeadlights();
        Wheel[] wheels = detailFactory.createWheels(R17);
        Usb usb = detailFactory.createUsb();
        CruiseControl cruiseControl = detailFactory.createCruiseControl();


        return new Camry(color,250,GearBox.AUTOMATIC,false,price,gaoline,wheels,engine, headlights,
                , R17, cruiseControl,usb, cruiseControl);
//
//        return  new Camry(color,
//                250,
//                GearBox.AUTOMATIC,
//                false
//                 price,
//                 detailFactory.createGaoline(),
//                 detailFactory.createEngine(),
//                 detailFactory.createHeadlights(),
//                 detailFactory.createSafeWheel(),
//                 detailFactory.createSocket1(),
//                 detailFactory.createCruiseControl()
//                 );


    }

    public Solara createSolara(String color, double price) throws StartCarException {
        Engine engine = detailFactory.createEngine();
        Gasoline gaoline = detailFactory.createGaoline();
        Headlights headlights = detailFactory.createHeadlights();
        Wheel[] wheels = detailFactory.createWheels(R17);
        Roof roof = detailFactory.createRoof();
        MiniFridge miniFridge = detailFactory.createMiniFridge();

        return  new Solara(color,300,GearBox.ROBOT,false,price,gaoline, R16, engine);
    }


}
