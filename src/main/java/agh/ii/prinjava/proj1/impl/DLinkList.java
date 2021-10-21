package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int length = 0;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T t){
            this.elem = t;
        }
    }

    public E getHead() {
        if (length == 0){
            return null;
        }
        return this.head.elem;
    }

    public E getTail() {
        if (length == 0){
            return null;
        }
        return this.tail.elem;
    }

    public int getLength() {
        return this.length;
    }


    public boolean isEmpty(){
        if (length == 0)
            return true;
        return false;
    }

    void addFirst(E data){
        Node<E> begin = new Node<E>(data);
        length ++;
        if (isEmpty()){
            tail = begin;
        }
        else{
            begin.next = head;
        }
        head = begin;
    }

    void addLast(E data){
        length++;
        Node <E> end = new Node<E>(data);
        if (tail == null){
            head = end;
        }
        else{
            tail.next = end;
            end.prev = tail;
        }
        tail = end;
    }

    E removeFirst(){
        if (isEmpty()){
            return null;
        }
        E value = head.elem;
        head = head.next;
        length--;
        return value;
    }

    E removeLast(){
        if (isEmpty()){
            return null;
        }
        E value = tail.elem;
        tail = tail.prev;
        length--;
        return value;
    }



    @Override
    public String toString() {
        return "DLinkList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }

    E peekfunction(){
        if (isEmpty()){
            return null;
        }
        else{
            return head.elem;
        }
    }

    int numberofelem(){
        return length;
    }


}
