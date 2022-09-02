package com.company.car.spareParts;

public class Gasoline extends SpareParts {
     private int levelGas;


    public Gasoline( int levelGas) {
        super();
        this.levelGas = levelGas ;
    }

    public int getLevelGas() {
        return levelGas;
    }

    public void setLevelGas(int levelGas) {
        this.levelGas = levelGas;
    }
}
