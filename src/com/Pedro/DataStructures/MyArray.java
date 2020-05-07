package com.Pedro.DataStructures;

import java.lang.reflect.Array;

public class MyArray {

    int arr[] = null;

    public MyArray(int size) {
        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;

        }
    }

    public void printArray() {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public int get(int index) {
        if (arr == null) {
            throw new NullPointerException();
        } else if (index >= 0 && index < arr.length)
            return arr[index];
        else
           throw new ArrayIndexOutOfBoundsException("Index out of bounds" + index);
    }

    public boolean searchArray(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return true;
        }

        return false;
    }

    public boolean deleteInArray(int index) {
        if (index >= 0 && index < arr.length) {
            arr[index] = Integer.MIN_VALUE;
            return true;
        }
        throw new IndexOutOfBoundsException("Index out of bounds" + index);
    }

    public void insert(int location, int value) {

        if (location >= 0 && location < arr.length) {
            arr[location] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds: " + location);
        }
    }

}

