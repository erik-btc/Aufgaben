package com.btcag.bootcamp.Aufgaben_Woche_3.Vorlesung.MessengerOhneDI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTestWithoutDI {

    @Test
    void testSendMessageWithBasicService() {
        User user = new User("Alice");

        String expectedOutput = "Alice: BasicMessageService: Hello!";
        assertEquals(expectedOutput, user.sendMessage("Hello!", false));
    }
    @Test
    void testSendMessageWithAdvancedService() {
        User user = new User("Bob");

        String expectedOutput = "Bob: AdvancedMessageService: [ADVANCED] Hi there!";
        assertEquals(expectedOutput, user.sendMessage("Hi there!", true));
    }
}