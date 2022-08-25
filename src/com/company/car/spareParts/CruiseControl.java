package com.company.car.spareParts;

public class CruiseControl extends SpareParts {
    private boolean isWorked;

    public CruiseControl() {
        this.isWorked = false;
    }
    public void turn(){
        isWorked = !isWorked;
        if (isWorked) {
            System.out.println("cruise control ON");
        } else {
            System.out.println("cruise control OFF");
        }
    }

    public boolean isWorked() {
        return isWorked;
    }
}
