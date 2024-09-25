package com.btcag.bootcamp.Aufgaben_Woche_2;

import java.util.Scanner;

public class W02QuadratischeGleichungen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie a an: ");
        double a = scanner.nextInt();
        System.out.println("Bitte geben Sie b an: ");
        double b = scanner.nextInt();
        System.out.println("Bitte geben Sie c an: ");
        double c = scanner.nextInt();
        double d = (b*b) - (4*a*c);
        if (d < 0) {
            System.out.println("Keine Lösung");
        }
        else if (d == 0) {
            System.out.println("Eine Lösung");
        }
        else {
            System.out.println("Zwei Lösungen");
        }
        System.out.println(d);
    }
}
