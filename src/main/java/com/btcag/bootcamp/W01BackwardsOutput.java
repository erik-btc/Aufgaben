package com.btcag.bootcamp;

import java.util.Scanner;

public class W01BackwardsOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zeichenkette eingeben:");
        String input = scanner.nextLine();
        String result = "";
        int length = input.length();

        while (length > 0) {
            result += input.charAt(length - 1);
            length--;
        }
        System.out.println("Ergebnis String: " + result);

        System.out.println("Bitte Zahl eingeben:");
        long eingabe = scanner.nextLong();

        long reverse = 0;
        while( eingabe !=0){
            reverse = reverse *10 + eingabe%10;
            eingabe= eingabe/10;
        }
        System.out.println("Ergebnis Zahl: " + reverse);
    }
}
