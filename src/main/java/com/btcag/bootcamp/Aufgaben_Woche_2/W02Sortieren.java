package com.btcag.bootcamp.Aufgaben_Woche_2;

import java.util.Scanner;

public class W02Sortieren {
    public static int[] arraySortieren(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Bitte geben Sie 5 Zahlen ein: ");
        for (int x = 0; x < array.length; x++) {
            array[x] = scanner.nextInt();
        }

        int[] sortierterArray = arraySortieren(array);
        System.out.println("Sortiertes Array:");
        for (int i = 0; i < sortierterArray.length; i++) {
            System.out.println(sortierterArray[i]);
        }
    }
}
