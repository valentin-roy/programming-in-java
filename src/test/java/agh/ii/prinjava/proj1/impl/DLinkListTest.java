package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isEmpty() {
        assertTrue(dLinkList.isEmpty());
        dLinkList.addFirst(1);
        assertFalse(dLinkList.isEmpty());
    }

    @Test
    void addFirst() {
        dLinkList.addFirst(1);
        assertEquals(1,dLinkList.peekfunction());
    }

    @Test
    void addLast() {
        dLinkList.addLast(1);
        assertEquals(1,dLinkList.peekfunction());
    }

    @Test
    void removeFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        assertEquals(3, dLinkList.removeFirst());
    }

    @Test
    void removeLast() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        assertEquals(3,dLinkList.removeLast());
    }

    @Test
    void testToString(){
        assertTrue(dLinkList.toString().contains("length=" + dLinkList.getLength()));
        assertTrue(dLinkList.toString().contains("head=" + dLinkList.getHead()));
        assertTrue(dLinkList.toString().contains("tail=" + dLinkList.getTail()));

    }

    @Test
    void peekfunction() {
        dLinkList.addLast(1);
        assertEquals(1, dLinkList.peekfunction());
    }

    @Test
    void numberofelem() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        assertEquals(2, dLinkList.numberofelem());
    }
}