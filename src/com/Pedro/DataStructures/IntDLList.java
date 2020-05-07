package com.Pedro.DataStructures;

public class IntDLList {

    private IntDLLNode head, tail;

    public IntDLList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToTail(int el) {
        if (!isEmpty()) {
            tail = new IntDLLNode(el, null, tail);
            tail.prev.next = tail;

        } else head = tail = new IntDLLNode(el);
    }

    public int removeFromTail() {
        int el = tail.info;
        if (head == tail)
            head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
        return el;

    }

    public void addToHead(int el) {
        head = new IntDLLNode(el, head, null);
        if (tail == null) {
            tail = head;
        } else {
            head.next.prev = head;
        }

    }

    public int removeFromHead() {
        int tmp = head.info;
        IntDLLNode tmp2;
        if (head == tail)
            head = tail = null;
        else {
            for (tmp2 = head; tmp2 != tmp2.next; tmp2 = head.next) ;

            head.next = null;
            tmp2.prev = null;
        }
        return 0;
    }
}

