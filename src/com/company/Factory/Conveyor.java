package com.company.Factory;

import com.company.car.CarType.Dyna;
import com.company.car.StartCarException;
import com.company.car.models.Camry;
import com.company.car.models.Solara;
import com.company.car.spareParts.*;

public class Conveyor extends Factory{
    private Color color;
    private SalePrice price;

    public Conveyor(Country country, String color, GearBox gearBox, Gasoline gasoline, Engine engine,
                    Headlights headlights, Wheel wheel, com.company.Factory.Color color1, SalePrice price) {
        super(country, color, gearBox, gasoline, engine, headlights, wheel);
        this.color = color1;
        this.price = price;
    }

    @Override
    public com.company.Factory.Color getColor() {
        return color;
    }

    public void setColor(com.company.Factory.Color color) {
        this.color = color;
    }

    public SalePrice getPrice() {
        return price;
    }

    public void setPrice(SalePrice price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Conveyor{" +
                "color=" + color +
                ", price=" + price +
                '}';
    }

    public void createCamry() {
        if ( getColor() == Color.BLACK && getPrice() == SalePrice.PriceCamry && getCountry() == Country.RUSSIA){

            try {
                System.out.println(new Camry());
            } catch (StartCarException e) {
                e.printStackTrace();
             }

        }
    }

    public void createSolara(){
        if (getColor() == Color.RED && getPrice() == SalePrice.PriceSolara && getCountry() == Country.USA){
            try {
                System.out.println( new Solara());
            } catch (StartCarException e) {
                e.printStackTrace();
            }
        }
    }

    public void createDyna(){
        if (getColor() == Color.WHITE && getPrice() == SalePrice.PriceDyna && getCountry() == Country.JAPAN) {
            try {
                System.out.println(new Dyna());
            } catch (StartCarException e) {
                e.printStackTrace();
            }
        }
    }



}
