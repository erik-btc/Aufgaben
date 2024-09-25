package com.btcag.bootcamp.Aufgaben_Woche_1;

import java.util.Scanner;

public class W01Subnetting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe das erste Oktett der IP Adresse an: ");
        long erstesOktett = scanner.nextLong();
        System.out.println("Bitte gebe das zweite Oktett der IP Adresse an: ");
        long zweitesOktett = scanner.nextLong();
        System.out.println("Bitte gebe das dritte Oktett der IP Adresse an: ");
        long drittesOktett = scanner.nextLong();
        System.out.println("Bitte gebe das vierte Oktett der IP Adresse an: ");
        long viertesOktett = scanner.nextLong();
        System.out.println("Bitte gebe die Subnetzmaske an: ");
        long subnetzBits = scanner.nextLong();

        //berechnung anzahl hostbits
        long hostBits = 32 - subnetzBits;

        //netzadresse berechnen
        long viertesOktettNetzadresse = (viertesOktett >> hostBits) << hostBits;

        //broadcastadresse berechnen
        long viertesOktettBroadcast = viertesOktettNetzadresse + (1L << hostBits) - 1;

        //ausgabe netzadresse
        System.out.println("Die Netzadresse ist: " + erstesOktett + "." + zweitesOktett + "." + drittesOktett + "." + viertesOktettNetzadresse);

        //ausgabe broadcastadresse
        System.out.println("Die Broadcastadresse ist: " + erstesOktett + "." + zweitesOktett + "." + drittesOktett + "." + viertesOktettBroadcast);
    }
}
