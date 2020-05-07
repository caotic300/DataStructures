package com.Pedro.DataStructures;

public class IntNode {
    int info;
    IntNode next;

    public IntNode(int info) {
        this(info, null);
    }
    public IntNode(int info, IntNode next) {
        this.info = info;
        this.next = next;
    }
}

