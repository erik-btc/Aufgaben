package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerMitDI;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice", new BasicMessageService());
        user1.sendMessage("Hello from Alice! I'm using BasicMessageService.");

        User user2 = new User("Bob", new AdvancedMessageService());
        user2.sendMessage("Hello from Bob! I'm using AdvancedMessageService.");

        User user3 = new User("Carl", new SMSMessageService());
        user3.sendMessage("Hello from Carl! I'm using SMSService.");
    }
}