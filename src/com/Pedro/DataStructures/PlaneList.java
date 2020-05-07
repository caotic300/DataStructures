package com.Pedro.DataStructures;

public class PlaneList {
    protected PlaneNode head, tail;

    public PlaneList() {
        head = null;
        tail = null;
    }

    public void addToHead(Plane plane) {
        head = new PlaneNode(plane, head);
        if (head == tail) {
            tail = head;
        }
    }

    public void addToTail(Plane plane) {
        if (!isEmpty()) {
            tail.next = new PlaneNode(plane);
        } else head = tail = new PlaneNode(plane);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Plane deleteFromHead() {
        Plane el = head.info;
        if (head == tail)
            head = tail = null;
        else head = head.next;

        return el;

    }

    public Plane deleteFromTail() {
        Plane el = tail.info;
        if (head == tail) {
            head = tail = null;
        } else {
            PlaneNode tmp;
            for (tmp = head; tmp.next != tail; tmp = tmp.next);
            tail = tmp;
            tail.next = null;
        }
        return el;
    }

    public void delete(Plane el) {
        if (!isEmpty()) {
            if (head == tail && head.info.equals(el))
                head = tail = null;
            else if (head.info.equals(el))
                head = head.next;
            else {
                PlaneNode pred, tmp;
                for (pred = head, tmp = head.next; tmp != null && !tmp.info.equals(el); pred = pred.next, tmp = tmp.next);
                if (tmp != null) {
                    pred.next = tmp.next;
                    if (tmp == tail) {
                        tail = pred;
                    }
                }
            }
        }
    }

    public boolean isInList(Plane plane) {
        PlaneNode tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(plane); tmp = tmp.next);
        return tmp != null;
    }

    public void printAll() {
        for (PlaneNode tmp = head; tmp.next != null; tmp = tmp.next)
            System.out.println("Plane is " +  tmp.info);
    }
}
