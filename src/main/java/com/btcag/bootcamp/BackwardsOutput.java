package com.btcag.bootcamp;

import java.util.Scanner;

public class BackwardsOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl ein: ");
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
