package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung;

public class Aircraft {
    protected final int maxHeight;
    protected final int capacity;
    protected final int maxSpeed;
    protected final int weight;
    protected final String engine;
    protected final String aircraftName;
    protected final String aircraftType;


    public Aircraft(int maxHeight, int capacity, int maxSpeed, int weight, String engine, String aircraftName) {
        this.maxHeight = maxHeight;
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.engine = engine;
        this.aircraftName = aircraftName;
        this.aircraftType = engine;
    }


}
