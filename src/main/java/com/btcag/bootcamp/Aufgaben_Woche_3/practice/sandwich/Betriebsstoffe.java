package com.btcag.bootcamp.Aufgaben_Woche_3.practice.sandwich;

public class Betriebsstoffe {
    private final int stromVerbrauch;
    private final int wasserVerbrauch;
    private final int gasVerbrauch;

    public Betriebsstoffe() {
        this.stromVerbrauch = 3;
        this.wasserVerbrauch = 1;
        this.gasVerbrauch = 2;
    }
    public int getStromVerbrauch() {
        return stromVerbrauch;
    }
    public int getWasserVerbrauch() {
        return wasserVerbrauch;
    }
    public int getGasVerbrauch() {
        return gasVerbrauch;
    }


}
