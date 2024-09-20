package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktorzerlegung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein (long): ");
        long zahl = scanner.nextLong();
        long teiler = 2;
        while (zahl > 1) {
            while (zahl % teiler == 0) {
                System.out.print(teiler + " ");
                zahl = zahl / teiler;
            }
            teiler++;
        }
    }
}
