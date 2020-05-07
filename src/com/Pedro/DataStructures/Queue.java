package com.Pedro.DataStructures;

public class Queue {
    private QueueNode head, tail;
    public Queue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = tail = null;
    }

    public Object firstEl() {
        return head.info;
    }

    public void enqueue(Object el) {
        if (!isEmpty()) {
            tail.next = new QueueNode(el);
            tail = tail.next;
        } else head = tail = new QueueNode(el);
    }

    public Object dequeue() {
        if (!isEmpty()) {
            Object el = head.info;

            if (head == tail) {
                head = tail = null;
            } else head = head.next;

            return el;
        } else return null;
    }

}
