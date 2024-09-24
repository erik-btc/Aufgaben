package com.btcag.bootcamp;

import java.util.Scanner;

public class Subnetting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe das erste Oktett der IP Adresse an: ");
        long erstesOktett = scanner.nextLong();
        System.out.println("Bitte gebe das zweite Oktett der IP Adresse an: ");
        long zweitesOktett = scanner.nextLong();
        System.out.println("Bitte gebe das dritte Oktett der IP Adresse an: ");
        long dritteOktett = scanner.nextLong();
        System.out.println("Bitte gebe das vierte Oktett der IP Adresse an: ");
        long viertesOktett = scanner.nextLong();
        System.out.println("Bitte gebe die Subnetzmaske an: ");
        long subnetzmask = scanner.nextLong();



        System.out.println("Die Netzadresse ist: " + erstesOktett + "." + zweitesOktett + "." + dritteOktett + "." + viertesOktett);
        System.out.println("Die Broadcastadresse ist: " + erstesOktett + "." + zweitesOktett + "." + dritteOktett + "." + viertesOktett);
    }
}
