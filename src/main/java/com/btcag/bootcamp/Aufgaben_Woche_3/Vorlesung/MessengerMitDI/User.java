package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerMitDI;

class User {
    private String name;
    private MessageService messageService;

    public User(String name, MessageService messageService) {
        this.name = name;
        this.messageService = messageService;
    }

    public short sendMessage(String message) {
        System.out.println(name + ": " + messageService.sendMessage(message));
        return 0;
    }
}