package com.Pedro.DataStructures;

public class IntSLList {
    protected IntNode head, tail;

    public IntSLList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(int el) {
        head = new IntNode(el, head);
        if (tail == null) {
            tail = head;
        }
    }

    public void addToTail(int el) {
        if (!isEmpty()) {
            tail.next = new IntNode(el);
            tail = tail.next;
        } else head = tail = null;

    }

    public int deleteFromHead() {
        int el = head.info;
        if (head == tail)
            head = tail = null;
        else head = head.next;
        return el;
    }

    public int deleteFromTail() {
        int el = tail.info;
        if (head == tail) {
            head = tail = null;
        } else {
            IntNode tmp;
            for (tmp = head; tmp.next != tail; tmp = head.next) ;
            tail = tmp.next;
            tail.next = null;
        }

        return el;
    }

    public void delete(int el) {
        if (!isEmpty()) { //if it is not empty
            if (head == tail && el == head.info) // if it is one node and el is the value of it
                head = tail = null;
            else if (el == head.info) //if there are more but el is the value of head node
                head = head.next;
            else {
                IntNode tmp, pred;

                //if there are more and el is not in head node
                for (pred = head, tmp = head.next; tmp.next != null && tmp.info != el; pred = pred.next, tmp = tmp.next) {
                    if (tmp != null) { //if el was found
                        pred.next = tmp.next;

                        if (tmp == tail) // if el is in the last node
                            tail = pred;
                    }
                }
            }
        }
    }

    public void printAll() {
        for (IntNode tmp = head; tmp != null; tmp = tmp.next) {
            System.out.println(tmp.info + " ");
        }
    }

    public boolean isInList(int el) {
        IntNode tmp;
        for (tmp = head; tmp != null && tmp.info != el; tmp = tmp.next);
        return tmp != null;

    }

}
