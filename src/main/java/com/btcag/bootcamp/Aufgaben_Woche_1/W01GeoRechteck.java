package com.btcag.bootcamp.Aufgaben_Woche_1;

import java.util.Scanner;

public class W01GeoRechteck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze positive Zahl ein: ");
        long laenge = scanner.nextInt();
        System.out.println("Bitte geben Sie eine zweite ganze positive Zahl ein: ");
        long breite = scanner.nextInt();
        double flaeche = laenge * breite;
        System.out.println("Das Ergebnis ist: " + flaeche);
    }
}
