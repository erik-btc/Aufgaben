package com.btcag.bootcamp.Aufgaben_Woche_2;

import java.util.Scanner;

public class W02ImmerPositiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (1 == 1) {
            System.out.println("Bitte gebe eine Ganzzahl ein: ");
            int ganzahl = scanner.nextInt();
            int i = 0;
            while (ganzahl < 0) {
                ganzahl++;
                i++;
            }
            int ergebnis = ganzahl + i;
            System.out.println(ergebnis);
        }
    }
}
