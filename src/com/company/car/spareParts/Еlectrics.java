package com.company.car.spareParts;

public class Еlectrics extends BrokenParts{

    public boolean electrics;

    public Еlectrics(boolean broken, boolean electrics) {
        super(broken);
        this.electrics = electrics;
    }

}
