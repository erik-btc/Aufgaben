package com.btcag.bootcamp.Aufgaben_Woche_1;

import java.util.Scanner;

public class W01Quersumme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl eingeben (long): ");
        long zahlLong = scanner.nextLong();
        long quersummeLong = 0;
        long restLong;
        while (zahlLong > 0) {
            restLong = zahlLong % 10;
            quersummeLong = quersummeLong + restLong;
            zahlLong = zahlLong / 10;
        }
        System.out.println("Die Quersumme der Zahl (long) ist: " + quersummeLong);


        System.out.println("Bitte Zahl eingeben (String): ");
        scanner.nextLine();
        String zahlString = scanner.nextLine();
        int quersummeString = 0;
        int index = 0;
        while (index < zahlString.length()) {
            char ziffer = zahlString.charAt(index);
            int zifferWert = ziffer - '0';
            quersummeString = quersummeString + zifferWert;
            index++;
        }
        System.out.println("Die Quersumme der Zahl (String) ist: " + quersummeString);
    }
}
