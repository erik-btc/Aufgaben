package com.btcag.bootcamp;

import java.util.Scanner;

public class FibonacciZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();
        int fibZahl = 0;
        int extraZahl = 1;
        System.out.println("Fibonacci-Zahlen bis " + zahl);
        while (fibZahl < zahl){
            System.out.print(fibZahl + " ");
            fibZahl += extraZahl;
            extraZahl = fibZahl;
        }
    }
}
