package com.btcag.bootcamp.Aufgaben_Woche_1;

import java.util.Scanner;

public class W01PiAufDefinierteGenauigkeit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der Iterationen ein: ");
        int iterationen = scanner.nextInt();
        double pi = 0.0;
        double zaehler = 4.0;
        double nenner = 1.0;
        int i = 0;
        int vorzeichen = 1;
        while (i < iterationen) {
            pi = pi + vorzeichen * (zaehler / nenner);
            nenner = nenner + 2;
            vorzeichen = vorzeichen * -1;
            i = i + 1;
        }
        System.out.println("Die angenäherte Zahl Pi nach " + iterationen + " Iterationen ist: " + pi);
    }
}
