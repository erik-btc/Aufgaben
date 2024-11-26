package com.btcag.bootcamp.Aufgaben_Woche_3.QueueList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueList list = new QueueList();

        int userInput;
        do {


            System.out.println(
                    """
                    (1) gibt das erste Element zurück und löscht dieses von den Daten
                    (2) gibt das letzte Element zurück und entfernt dieses von den Daten
                    (3) fügt dieses Element den Daten am Anfang hinzu
                    (4) fügt dieses Element den Daten am Ende hinzu
                    (5) gibt an Stelle i das Element zurück, entfernt es aber nicht
                    (6) Beende das Programm \n""");


            


            System.out.println("So sieht das aktuelle Array aus: " + list);


            userInput = scanner.nextInt();


            if (userInput == 1) {
                list.popFront();
                System.out.println("Das Element 1 wurde entfernt");
            } else if (userInput == 2) {
                list.popLast();
                System.out.println("Das Element 5 wurde entfernt");
            } else if (userInput == 3) {
                int number = scanner.nextInt();
                list.pushFront(number);
                System.out.println("Das Element " + number + "wurde hinzugefügt");
            } else if (userInput == 4) {
                int number = scanner.nextInt();
                list.pushLast(number);
                System.out.println("Das Element " + number + "wurde hinzugefügt");
            } else if (userInput == 5) {
                System.out.println("Welche stelle möchtest du sehen?");
                int number = scanner.nextInt();
                list.get(number);
            }

            System.out.println("So sieht das neue Array aus: " + list);
        } while (userInput != 6);
    }
}