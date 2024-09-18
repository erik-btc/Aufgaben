package com.btcag.bootcamp;

import java.util.Scanner;

public class GeoKreis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Bitte geben Sie eine ganze positive Zahl ein: ");
        int radius = scanner.nextInt();
        double result = pi * (radius*radius);
        System.out.println("Das Ergebnis ist: " + result);
    }
}
