package com.company.car.spareParts;

import com.company.car.CarType.Cabriolet;

public class Roof  {
    private  boolean isUp;

    public Roof() {
        this.isUp = false;
    }

    public boolean isUp() {
        return isUp;
    }

    public void  turn(){
        isUp = !isUp;
        if (isUp){
            System.out.println("the roof is lowered");
        } else {
            System.out.println("the roof is lowered");
        }


    }
}
