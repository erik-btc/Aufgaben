package com.btcag.bootcamp.Aufgaben_Woche_3.ByRef;


import java.util.Scanner;


public class ByRef extends DoubleValue {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine positive Ganzzahl eingeben: ");
        WertObjekt number = new WertObjekt(scanner.nextInt());
        doubleValue(number);


        System.out.println(number.value);

    }
}