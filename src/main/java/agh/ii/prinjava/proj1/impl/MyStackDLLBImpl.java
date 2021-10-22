package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * function to remove an element at the beginning of the stack
     */

    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /**
     * function to add an element at the end of the stack
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    /**
     * function to get the number of elements of the stack
     */

    @Override
    public int numOfElems() {
        return elems.numberofelem();
    }

    @Override
    public E peek() {
        if (isEmpty()){
            return null;
        }
        return elems.getHead();
    }
}
