package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerOhneDI;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        user1.sendMessage("Hello from Alice! I'm using BasicMessageService.", false);

        User user2 = new User("Bob");
        user2.sendMessage("Hello from Bob! I'm using AdvancedMessageService.", true);
    }
}