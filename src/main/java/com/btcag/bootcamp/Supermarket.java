package com.btcag.bootcamp;

import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte alle Produkte in Cent eingeben und mit 0 die Liste beenden: ");
        long geld = 0;
        long input = -1;
        while (input != 0){
            input = scanner.nextLong();
            geld += input;
        }
        System.out.println("Die Summe aller Produkte in Cent ist: " + geld);
        System.out.println("\nWie viel hat der Kunde gegeben (in Cent) ?");
        long kundeGeld = scanner.nextLong();
        double geldZurueckInEuro = (double) ((geld - kundeGeld) * -1) / 100;
        long geldZurueckInCent =((geld - kundeGeld) * -1);
        System.out.printf("Der zurückzugebende Betrag in Euro: %.2f%n", geldZurueckInEuro);
        long zweihunderter = 0;
        long hunderter = 0;
        long fuenfziger = 0;
        long zwanziger = 0;
        long zehner = 0;
        long fuenfer = 0;
        long zweier = 0;
        long einer = 0;
        long fuenfzigCent = 0;
        long zwanzigCent = 0;
        long zehnCent = 0;
        long fuenfCent = 0;
        long zweiCent = 0;
        long einCent = 0;
        System.out.println(geldZurueckInCent);
        while (geldZurueckInCent >= 20000){
            zweihunderter++;
            geldZurueckInCent = geldZurueckInCent - 20000;
        }
        while (geldZurueckInCent >= 10000){
            hunderter++;
            geldZurueckInCent = geldZurueckInCent - 10000;
        }
        while (geldZurueckInCent >= 5000){
            fuenfziger++;
            geldZurueckInCent = geldZurueckInCent - 5000;
        }
        while (geldZurueckInCent >= 2000){
            zwanziger++;
            geldZurueckInCent = geldZurueckInCent - 2000;
        }
        while (geldZurueckInCent >= 1000){
            zehner++;
            geldZurueckInCent = geldZurueckInCent - 1000;
        }
        while (geldZurueckInCent >= 500){
            fuenfer++;
            geldZurueckInCent = geldZurueckInCent - 500;
        }
        while (geldZurueckInCent >= 200){
            zweier++;
            geldZurueckInCent = geldZurueckInCent - 200;
        }
        while (geldZurueckInCent >= 100){
            einer++;
            geldZurueckInCent = geldZurueckInCent - 100;
        }
        while (geldZurueckInCent >= 50){
            fuenfzigCent++;
            geldZurueckInCent = geldZurueckInCent - 50;
        }
        while (geldZurueckInCent >= 20){
            zwanzigCent++;
            geldZurueckInCent = geldZurueckInCent - 20;
        }
        while (geldZurueckInCent >= 10){
            zehnCent++;
            geldZurueckInCent = geldZurueckInCent - 10;
        }
        while (geldZurueckInCent >= 5){
            fuenfCent++;
            geldZurueckInCent = geldZurueckInCent - 5;
        }
        while (geldZurueckInCent >= 2){
            zweiCent++;
            geldZurueckInCent = geldZurueckInCent - 2;
        }
        while (geldZurueckInCent >= 1){
            einCent++;
            geldZurueckInCent = geldZurueckInCent - 1;
        }

        System.out.println("Zweihunderter: "+ zweihunderter + "\nHunderter: " + hunderter + "\nFünfziger: " + fuenfziger + "\nZwanziger: " + zwanziger + "\nZehner: " + zehner + "\nFünfer: " + fuenfer + "\nZweier: " + zweier + "\nEiner: " + einer + "\nFünfzig Cent: " + fuenfzigCent + "\nZwanzig Cent: " + zwanzigCent + "\nZehn Cent: " + zehnCent + "\nFünf Cent: " + fuenfCent + "\nZwei Cent: " + zweiCent + "\nEin Cent: " + einCent);
    }
}
