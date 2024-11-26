package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerMitDI;

class BasicMessageService implements MessageService {
    public String sendMessage(String message) {
        return "BasicMessageService: " + message;
    }
}