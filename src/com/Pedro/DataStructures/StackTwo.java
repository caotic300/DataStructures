package com.Pedro.DataStructures;

import java.util.Vector;

public class StackTwo {
   private Vector pool = new Vector();

    public StackTwo() {

    }

    public StackTwo(int el) {
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
