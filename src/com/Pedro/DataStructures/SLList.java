package com.Pedro.DataStructures;

public class SLList {
    protected SLLNode head = null;
    public SLList() {

    }

    public boolean isEmpty() {
        return head == null;
    }
    public Object first() {
        return head.info;
    }

    public void printAll() {
        for (SLLNode tmp = head; tmp.next != null; tmp = tmp.next)
            System.out.println(tmp.info.toString());
    }

    public void add(Object el) {
        head = new SLLNode(el, head);
    }

    public Object find(Object el) {
        SLLNode tmp = head;
        for ( ; tmp != null && !(el.equals(tmp.info)); tmp = tmp.next);
        if (tmp == null)
            return null;
        else return tmp.info;
    }

    public Object deleteHead() {
        Object el = head.info;
        head = head.next;
        return el;
    }

    public void delete(Object el) {
        if (head != null) {
            if (el.equals(head.info))
                head = head.next;
            else {
                SLLNode pred = head, tmp = head.next;
                for ( ; tmp != null && !(tmp.info.equals(el)); pred = pred.next, tmp = tmp.next);
                if (tmp != null)
                    pred.next = tmp.next;

            }
        }
    }

}
