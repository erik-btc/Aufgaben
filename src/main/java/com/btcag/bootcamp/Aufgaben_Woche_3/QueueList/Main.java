package com.btcag.bootcamp.Aufgaben_Woche_3.QueueList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueList list = new QueueList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Was möchtest du machen ?
                (1) Das erste Element zurückgeben und löscht es danach.
                (2) Das letzte Element zurückgeben und löscht es danach.
                (3) Zahl eingeben und am Ende hinzufügen.
                (4) Zahl eingeben und am Anfang hinzufügen.
                (5) Zahl eingeben und das Objekt zurück bekommen, aber nicht löschen.
                """);

        int input = scanner.nextInt();
        int userInput;

        if (input == 1) {
            System.out.println("Das Element {queuelist.popFirst()} wurde gelöscht");
        }
        else if (input == 2) {
            System.out.println("Das Element {queuelist.popLast()} wurde gelöscht");
        }
        else if (input == 3) {
            System.out.println("Was möchtest du hinzufügen?");
            userInput = scanner.nextInt();
            System.out.println("Das Objekt {queuelist.pushLast(userInput)} wurde der Warteschlange am Ende hinzugefügt!");
        }
        else if (input == 4) {
            System.out.println("Was möchtest du hinzufügen?");
            userInput = scanner.nextInt();
            System.out.println("Das Objekt {queuelist.pushFirst(userInput)} wurde der Warteschlange am Anfang hinzugefügt!");
        }
        else if (input == 5) {
            System.out.println("Welches Element willst du auslesen?");
            userInput = scanner.nextInt();
            System.out.println("Das {userInput}. Element der Queue ist {queuelist.getObject(userInput)}");
        }
        else {
            System.out.println("Ungültige Zahl.");
        }
    }
}
