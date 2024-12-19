package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerMitDI;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTestWithDI {

    @Test
    void testSendMessageWithMockService() {
        MockMessageService mockService = new MockMessageService();
        User user = new User("Alice", mockService);
        String expectedOutput = "Alice: Mocked: Test message";
        assertEquals(expectedOutput, user.sendMessage("Test message"));
    }
    @Test
    void testSendMessageWithDifferentMockBehavior() {
        MessageService mockService = new MessageService() {
            @Override
            public String sendMessage(String message) {
                return "Another Mock: " + message;
            }
        };
        User user = new User("Bob", mockService);
        String expectedOutput = "Bob: Another Mock: Hello World";
        assertEquals(expectedOutput, user.sendMessage("Hello World"));
    }
}