package com.btcag.bootcamp;

import java.util.Scanner;

public class W01Primzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für den Primzahltest eingeben (Long): ");
        long zahl = scanner.nextLong();
        long i = 2;
        boolean istPrim = true;
        while (i <= zahl / 2) {
            while (zahl % i == 0) {
                istPrim = false;
                i = zahl;
            }
            i++;
        }
        System.out.println("Ergebnis: " + (istPrim ? "Die Zahl ist eine Primzahl" : "Die Zahl ist keine Primzahl"));
    }
}
