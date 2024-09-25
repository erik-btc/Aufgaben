package com.btcag.bootcamp.Aufgaben_Woche_2;

import java.util.Scanner;

public class W02Schaltjahre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (1 == 1) {
            System.out.println("Bitte Jahr eingeben: ");
            int jahr = scanner.nextInt();
            if (jahr % 400 == 0) {
                System.out.println(jahr + " ist ein Schaltjahr");
            } else if (jahr % 100 == 0) {
                System.out.println(jahr + " ist kein Schaltjahr");
            } else if (jahr % 4 == 0) {
                System.out.println(jahr + " ist ein Schaltjahr");
            } else {
                System.out.println(jahr + " ist kein Schaltjahr");
            }
        }
    }
}
