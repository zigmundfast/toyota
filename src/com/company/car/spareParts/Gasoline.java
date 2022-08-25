package com.company.car.spareParts;

public class Gasoline extends SpareParts {
     private int levelGas;


    public Gasoline( ) {
        super();
        this.levelGas = 0;
    }

    public int getLevelGas() {
        return levelGas;
    }

    public void setLevelGas(int levelGas) {
        this.levelGas = levelGas;
    }
}
