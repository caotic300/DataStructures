package com.Pedro.DataStructures;

public class IntDLLNode {
    public int info;
    public IntDLLNode next, prev;

    public IntDLLNode(int el) {
        this(el, null, null);
    }

    public IntDLLNode(int info, IntDLLNode next, IntDLLNode prev) {
        this.info = info;
        this.next = next;
        this.prev = prev;
    }
}
