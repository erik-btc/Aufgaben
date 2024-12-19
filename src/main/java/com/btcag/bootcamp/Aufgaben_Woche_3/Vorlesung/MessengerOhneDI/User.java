package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerOhneDI;

class User {
    private String name;
    private BasicMessageService basicMessageService = new BasicMessageService();
    private AdvancedMessageService advancedMessageService = new AdvancedMessageService();

    public User(String name) {
        this.name = name;
    }

    public String sendMessage(String message, boolean useAdvanced) {
        if (useAdvanced) {
            return name + ": " + advancedMessageService.sendMessage(message);
        } else {
            return name + ": " + basicMessageService.sendMessage(message);
        }
    }
}