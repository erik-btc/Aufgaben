package com.btcag.bootcamp.Aufgaben_Woche_1;

import java.util.Scanner;

public class W01Divisionscheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Divisor ein: ");
        int divisor = scanner.nextInt();
        System.out.println("Bitte geben Sie eine maximale Nummer ein: ");
        int maxNumber = scanner.nextInt();
        int result = 0;
        while (result < maxNumber) {
            System.out.println(result);
            result += divisor;
        }
    }
}