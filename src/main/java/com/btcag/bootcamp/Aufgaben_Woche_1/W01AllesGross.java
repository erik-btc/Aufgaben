package com.btcag.bootcamp.Aufgaben_Woche_1;
import java.util.Scanner;
public class W01AllesGross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        char reconversion;
        int length = input.length();
        int counter = 0;

        while (counter < length) {
            char currChar = input.charAt(counter);
            int ascii = (int) currChar;
            while (ascii > 90) {
                ascii -= 32;
            }
            reconversion = (char) ascii;
            output = output + reconversion;
            counter++;
        }
        System.out.println(output);
    }
}
