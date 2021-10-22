package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();


    /**
     * function to add an element at the end of the queue
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /**
     * function to remove an element at the beginning of the queue
     */
    @Override
    public E dequeue() {
        return elems.removeFirst();
    }

    /**
     * function to get the number of element of the
     */

    @Override
    public int numOfElems() {
        return elems.numberofelem();
    }

    @Override
    public E peek() {
        if(isEmpty()){
            return null;
        }
        return elems.getTail();
    }
}

