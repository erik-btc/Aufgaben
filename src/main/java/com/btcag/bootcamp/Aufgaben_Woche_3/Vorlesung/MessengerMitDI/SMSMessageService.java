package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerMitDI;

public class SMSMessageService implements MessageService{
    @Override
    public String sendMessage(String message) {
        return "SMSMessageService: " + message;
    }
}
