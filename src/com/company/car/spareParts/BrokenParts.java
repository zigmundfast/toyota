package com.company.car.spareParts;

public abstract class BrokenParts {
    private boolean broken;

    public BrokenParts(boolean broken) {
        this.broken = broken;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }
}
