package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerMitDI;

class AdvancedMessageService implements MessageService {
    public String sendMessage(String message) {
        return "AdvancedMessageService: [ADVANCED] " + message;
    }
}