package com.btcag.bootcamp;

import java.util.Scanner;

public class KryptischeZahlen {
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
