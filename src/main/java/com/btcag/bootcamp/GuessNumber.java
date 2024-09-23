package com.btcag.bootcamp;

import java.util.Scanner;

import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i = 0;
        int randomNumber = random.nextInt(15);
        System.out.println("Bitte gebe die Zahlengröße in Bits an: ");
        int number = 0;
        number = scanner.nextInt();
        while (randomNumber != number) {
            i++;
            System.out.println(i + ". Versuch: Bitte eine Zahl im Bereich 0 und 15 angeben:");
            number = scanner.nextInt();

        }
        System.out.println("Super!");
    }
}
