package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCIIKunst2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine positive Ganzzahl ein: ");
        int zahl = scanner.nextInt();
        int i = zahl;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println("");
            i--;
        }
        System.out.println();
        while (i < zahl) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
