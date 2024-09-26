package com.btcag.bootcamp.Aufgaben_Woche_2;

import java.util.Scanner;

public class W02FibonacciRekursiv {
    public static int a = 0;
    public static int b = 1;
    public static int fibonacci (int zahl) {
        int c = a + b;
        a = b;
        b = c;
        if (zahl > 1){
            zahl--;
            fibonacci(zahl);
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Nummer ein: ");
        int zahl = scanner.nextInt();
        System.out.println(fibonacci(zahl));

    }
}
