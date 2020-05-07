package com.Pedro.DataStructures;

public class SLLNode {
    public Object info;
    public SLLNode next;

    public SLLNode(Object el) {
        info = el;
       next = null;
    }

    public SLLNode(Object info, SLLNode next) {
        this.info = info;
        this.next = next;
    }
}
