package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(CarManufacture.BMW, 2006, 160);


        System.out.println(car.getManufacture());

        car.startEngine();
        car.setGear(2);
    }
}
