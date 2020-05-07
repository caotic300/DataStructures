package com.Pedro.DataStructures;

public class IntSkipListNode {
    public int key;
    public IntSkipListNode[] next;
    IntSkipListNode(int key, int next) {
        this.key = key;
        this.next = new IntSkipListNode[next];
        for (int j = 0; j < next; j++)
            this.next[j] = null;
    }
}
