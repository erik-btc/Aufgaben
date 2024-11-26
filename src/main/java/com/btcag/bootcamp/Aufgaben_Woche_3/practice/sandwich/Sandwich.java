package com.btcag.bootcamp.Aufgaben_Woche_3.practice.sandwich;

import java.util.Scanner;

public class Sandwich {
    Zutaten zutaten = new Zutaten("", "", "", "");

    public Sandwich(){

    }

    public void MakeASandwich(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welches Fleisch möchtest du haben ?");
        zutaten.setFleisch(scanner.nextLine());
        System.out.println("Welches Gemüse möchtest du haben ?");
        zutaten.setGemuese(scanner.nextLine());
        System.out.println("Welches Brot möchtest du haben ?");
        zutaten.setBrot(scanner.nextLine());
        System.out.println("Welchen Aufstrich möchtest du haben ?");
        zutaten.setAufstrich(scanner.nextLine());


    }

    public String ZutatenAusgabe(){
        return "Du hast folgende Zutaten gewählt\n" +
                "Fleisch: " + zutaten.getFleisch() + "\n" +
                "Gemüse: " + zutaten.getGemuese() + "\n" +
                "Brot: " + zutaten.getBrot() + "\n" +
                "Aufstrich: " + zutaten.getAufstrich();
    }

}
