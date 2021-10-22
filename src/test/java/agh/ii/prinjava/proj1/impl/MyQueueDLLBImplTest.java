package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * we enqueue some elements and then we dequeue elements and check the values returned
     */
    @Test
    void enqueue() {
        queueOfInts.enqueue(1);
        assertEquals(1, queueOfInts.peek());
        queueOfInts.enqueue(2);
        assertEquals(2, queueOfInts.peek());
    }

    /**
     * we enqueue some elements and then we dequeue elements and check the values returned
     */

    @Test
    void dequeue() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        assertEquals(1, queueOfInts.dequeue());
        assertEquals(2, queueOfInts.dequeue());
    }

    @Test
    void numOfElems() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        assertEquals(3, queueOfInts.numOfElems());
    }

    @Test
    void peek() {
        queueOfInts.enqueue(1);
        assertEquals(1,queueOfInts.peek());
    }
}