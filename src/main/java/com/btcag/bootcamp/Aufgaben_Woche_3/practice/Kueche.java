package com.btcag.bootcamp.Aufgaben_Woche_3.practice;


import java.util.Scanner;

public class Kueche {
    private int mitarbeiter;
    public Kueche() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sandwich sandwich = new Sandwich();
        Betriebsstoffe betriebsstoffe = new Betriebsstoffe();
        System.out.println("Was möchten Sie machen ? \n[1] Ein Sandwich machen [2] Das Programm beenden.");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            sandwich.MakeASandwich();
            System.out.println(sandwich.ZutatenAusgabe());
            System.out.println("Beim der Zubereitung vom Sandwich sind Stromkosten von " + betriebsstoffe.getStromVerbrauch() + "kWh, ein Wasserverbrauch von " + betriebsstoffe.getWasserVerbrauch() + "L und ein Gasverbrauch von " + betriebsstoffe.getGasVerbrauch() + "kWh/m³");
            System.out.println("Das sind kosten von insgesamt 5€.");
        }
        else if (userInput == 2) {
            System.out.println("Das Programm wird beenden.");
        }

    }

}
