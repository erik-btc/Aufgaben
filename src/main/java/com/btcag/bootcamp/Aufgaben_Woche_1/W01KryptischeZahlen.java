package com.btcag.bootcamp.Aufgaben_Woche_1;

import java.util.Scanner;

public class W01KryptischeZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Zahl eingeben: ");
        int zahl = scanner.nextInt();
        System.out.println("Bitte Password (ZAHL) eingeben: ");
        int pw = scanner.nextInt();
        long result = zahl ^ pw;
        System.out.println("Result: " + result);
    }
}
