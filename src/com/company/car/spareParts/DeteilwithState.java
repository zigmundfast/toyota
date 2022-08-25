package com.company.car.spareParts;

public abstract class DeteilwithState extends SpareParts {
    private boolean isBroken;

    public DeteilwithState(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
