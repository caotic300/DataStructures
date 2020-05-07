package com.Pedro.DataStructures;

import java.util.LinkedList;

public class LinkedStackTwo {
    private LinkedList list = new LinkedList();

    public LinkedStackTwo() {

    }

    public void clear() {
        list.clear();
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
