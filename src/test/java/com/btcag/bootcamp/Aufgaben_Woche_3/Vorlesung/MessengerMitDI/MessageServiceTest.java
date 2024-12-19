package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerMitDI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MockMessageService implements MessageService {
    @Override
    public String sendMessage(String message) {
        return "Mocked: " + message;
    }
}