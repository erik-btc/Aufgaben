package com.btcag.bootcamp;

import java.util.Scanner;

public class W01ASCIIKunst1Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine positive Ganzzahl ein: ");
        int zahl = scanner.nextInt();
        int i = 0;
        while (i < zahl) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
