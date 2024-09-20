package com.btcag.bootcamp;
import java.util.Scanner;
public class AllesGross {
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
