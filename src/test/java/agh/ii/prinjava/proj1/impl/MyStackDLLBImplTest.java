package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pop() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.pop());
        assertEquals(1, stackOfInts.pop());
    }

    @Test
    void push() {
        stackOfInts.push(1);
        assertEquals(1, stackOfInts.peek());
        stackOfInts.push(2);
        assertEquals(2,stackOfInts.peek());
    }

    @Test
    void numOfElems() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        assertEquals(3, stackOfInts.numOfElems());
    }

    @Test
    void peek() {
        stackOfInts.push(10);
        assertEquals(10,stackOfInts.peek());
    }
}