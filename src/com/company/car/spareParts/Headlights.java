package com.company.car.spareParts;

public class Headlights  extends BrokenParts{
    private boolean headLights;

    public Headlights(boolean broken, boolean headLights) {
        super(broken);
        this.headLights = headLights;
    }

}
