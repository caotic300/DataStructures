package com.Pedro.DataStructures;

public class PlaneNode {
    public Plane info;
    public PlaneNode next;

    public PlaneNode(Plane info) {
        this.info = info;
        this.next = null;
    }

    public PlaneNode(Plane info, PlaneNode next) {
        this.info = info;
        this.next = next;
    }
}
