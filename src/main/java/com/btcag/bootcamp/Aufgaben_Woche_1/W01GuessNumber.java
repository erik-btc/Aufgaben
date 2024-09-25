package com.btcag.bootcamp.Aufgaben_Woche_1;

import java.util.Scanner;
import java.util.Random;

public class W01GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(15);
        System.out.println("Bitte gebe die Zahlengröße in Bits an: ");
        int number;
        int i = 0;
        number = scanner.nextInt();
        while (randomNumber != number) {
            i++;
            System.out.println(i + ". Versuch: Bitte eine Zahl im Bereich 0 und 15 angeben:");
            number = scanner.nextInt();
            while (number < randomNumber) {
                System.out.println("Die gesuchte Zahl ist groesser!");
                break;
            }
            while (number > randomNumber) {
                System.out.println("Die gesuchte Zahl ist kleiner!");
                break;
            }
        }
        System.out.println("Super!");
    }
}
