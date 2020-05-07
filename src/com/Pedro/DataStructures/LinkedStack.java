package com.Pedro.DataStructures;

import java.util.LinkedList;

public class LinkedStack {
    private LinkedList list = new LinkedList();

    public LinkedStack() {

    }

    public void clear() {
        list.clear();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Object peek() {
        return list.getLast();
    }

    public Object pop() {
        return list.removeLast();
    }

    public void push(Object el) {
        list.add(el);
    }

    public String toString() {
        return list.toString();
    }
}