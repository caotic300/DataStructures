package com.Pedro.DataStructures;

import java.util.Vector;

public class Stack {

    private Vector pool = new Vector();

    public Stack() {

    }

    public Stack(int el) {
        pool.ensureCapacity(el);
    }

    public void clear() {
        pool.clear();
    }

    public Object peek() {
        return pool.lastElement();
    }

    public Object pop() {
        return pool.remove(pool.size() - 1);
    }

    public void push(Object el) {
        pool.addElement(el);
    }

    public String toString() {
        return pool.toString();
    }
}
