package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung;

public class Car {
    private final CarManufacture manufacture;
    private final int manufactureYear;
    private final int hp;

    private int speed = 0;
    private int gear = 0;
    private boolean runningEngine = false;

    public Car(CarManufacture manufacture, int manufactureYear, int hp) {
        this.manufacture = manufacture;
        this.manufactureYear = manufactureYear;
        this.hp = hp;
    }

    void startEngine(){
        runningEngine = true;
    }

    void setGear(int gear){
        if(!runningEngine){
            return;
        }
        this.gear = gear;
    }

    CarManufacture getManufacture() {
        return this.manufacture;
    }

}
