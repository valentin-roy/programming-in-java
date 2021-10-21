package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     *
     * @return
     */
    @Override
    public E pop() {
        return elems.removeFirst();
    }

    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

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
