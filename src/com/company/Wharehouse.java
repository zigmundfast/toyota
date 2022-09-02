package com.company;

import com.company.car.CarType.Dyna;
import com.company.car.models.Camry;
import com.company.car.models.Hiance;
import com.company.car.models.Solara;

public class Wharehouse {
    private static  int countCar =0;
    private int countCarArray =0;
    private static int freeSpaceArray = 1000;
    private static int freeSpace = 1000;
    private int countCamry = 0;
    private int countSolara = 0;
    private int countHiance = 0;
    private int countDyna = 0;

    private static Camry[] camryArray = new Camry[freeSpaceArray];
    private static Solara[] solaraArray = new Solara[freeSpaceArray];
    private static Hiance[] hianceArray = new Hiance[freeSpaceArray];
    private  static Dyna[] dynaArray = new Dyna[freeSpaceArray];

    public static int getCountCar() {return countCar;}

    public static void setCountCar(int countCar) {Wharehouse.countCar = countCar;}

    public int getCountCarArray() {return countCarArray;}

    public void setCountCarArray(int countCarArray) {this.countCarArray = countCarArray;}

    public static int getFreeSpaceArray() {return freeSpaceArray;}

    public static void setFreeSpaceArray(int freeSpaceArray) {Wharehouse.freeSpaceArray = freeSpaceArray;}

    public static int getFreeSpace() {return freeSpace;}

    public static void setFreeSpace(int freeSpace) {Wharehouse.freeSpace = freeSpace;}

    public int getCountCamry() {return countCamry;}

    public void setCountCamry(int countCamry) {this.countCamry = countCamry;}

    public int getCountSolara() {return countSolara;}

    public void setCountSolara(int countSolara) {this.countSolara = countSolara;}

    public int getCountHiance() {return countHiance;}

    public void setCountHiance(int countHiance) {this.countHiance = countHiance;}

    public int getCountDyna() {return countDyna;}

    public void setCountDyna(int countDyna) {this.countDyna = countDyna;}

    public static Camry[] getCamryArray() {return camryArray;}

    public static void setCamryArray(Camry[] camryArray) {
        Wharehouse.camryArray = camryArray;
    }

    public static Solara[] getSolaraArray() {
        return solaraArray;
    }

    public static void setSolaraArray(Solara[] solaraArray) {
        Wharehouse.solaraArray = solaraArray;
    }

    public static Hiance[] getHianceArray() {
        return hianceArray;
    }

    public static void setHianceArray(Hiance[] hianceArray) {
        Wharehouse.hianceArray = hianceArray;
    }

    public static Dyna[] getDynaArray() {
        return dynaArray;
    }

    public static void setDynaArray(Dyna[] dynaArray) {
        Wharehouse.dynaArray = dynaArray;
    }

    public void addCamry(Camry camry){
        if (freeSpace ==0) {
            System.out.println("out of storage space");
            return;
        }
        countCar++;
        freeSpace--;
        camryArray[countCarArray++] = camry;
    }

    public void viewCountCamry(){
        countCamry=0;
        for (Camry in: camryArray){
            if(in != null){
                countCamry++;
            }
        }
        System.out.println("number of Camry in stock" + countCamry);
    }

    public void removeFromStorage( int index){
        countCar--;
        if(index> countCamry){
            System.out.println("incorrect car storage location");
            return;
        } else {
            System.out.println("a car was taken from the warehouse" + camryArray[index].getClass());
            camryArray[index] = null;
            freeSpace++;
        }
    }





}
