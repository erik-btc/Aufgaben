package com.btcag.bootcamp.Aufgaben_Woche_3.QueueList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueListTest {

    QueueList list = new QueueList();

    @Test
    void testToString() {
        list.pushFront(1);
        list.pushFront(2);
        String expectedOutput = "[2, 1]";
        assertEquals(expectedOutput, list.toString());

    }

    @Test
    void popFront() {
        list.pushFront(1);
        list.pushFront(2);
        list.pushLast(3);
        assertEquals(2, list.popFront());
        assertEquals(1, list.popFront());
        assertEquals(3, list.popFront());
        assertEquals(-1, list.popFront());

    }

    @Test
    void popLast() {
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(1, list.popLast());
        assertEquals(2, list.popLast());
        assertEquals(3, list.popLast());
        assertEquals(-1, list.popLast());
    }

    @Test
    void pushLast() {

    }

    @Test
    void pushFront() {
        list.pushFront(6);
        list.pushFront(5);
        list.pushFront(4);
        list.pushFront(3);
        list.pushFront(2);
        list.pushFront(1);
        String expectedOutput = "[1, 2, 3, 4, 5, 6]";
        assertEquals(expectedOutput, list.toString());
    }

    @Test
    void get() {
        list.pushFront(1);
        assertEquals(1, list.get(0));
        list.popFront();
        assertEquals(-1, list.get(0));

    }
}