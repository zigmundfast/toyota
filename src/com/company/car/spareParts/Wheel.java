package com.company.car.spareParts;

public class Wheel extends DeteilwithState {
  private  boolean isBroken;
  private  CarWheelRadius carWheelRadius;

  public Wheel(CarWheelRadius carWheelRadius) {
    super(false);
    this.carWheelRadius = carWheelRadius;
  }
  public CarWheelRadius getCarWheelRadius() {
    return carWheelRadius;
  }

}

