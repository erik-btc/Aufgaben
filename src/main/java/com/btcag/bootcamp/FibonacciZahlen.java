package com.btcag.bootcamp;

import java.util.Scanner;

public class FibonacciZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();
        int a = 0;
        int b = 1;
        while (a <= zahl) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}