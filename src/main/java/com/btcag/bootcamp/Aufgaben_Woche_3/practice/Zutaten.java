package com.btcag.bootcamp.Aufgaben_Woche_3.practice;

public class Zutaten {
    private String fleisch;
    private String gemuese;
    private String brot;
    private String aufstrich;

    public Zutaten(String fleisch, String gemuese, String brot, String aufstrich) {
        this.fleisch = fleisch;
        this.gemuese = gemuese;
        this.brot = brot;
        this.aufstrich = aufstrich;
    }

    public void setFleisch(String fleisch) {
        this.fleisch = fleisch;
    }

    public void setGemuese(String gemuese) {
        this.gemuese = gemuese;
    }

    public void setBrot(String brot) {
        this.brot = brot;
    }

    public void setAufstrich(String aufstrich) {
        this.aufstrich = aufstrich;
    }

    public String getAufstrich() {
        return aufstrich;
    }

    public String getFleisch() {
        return fleisch;
    }

    public String getGemuese() {
        return gemuese;
    }

    public String getBrot() {
        return brot;
    }
}
