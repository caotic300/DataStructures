package com.Pedro.DataStructures;



public class TwoDimentionalArray {
    int[][] arr = null;

    public TwoDimentionalArray(int row, int col) {
        try {
            this.arr = new int[row][col];
            for (int rowpos = 0; rowpos < arr.length; rowpos++) {
                for (int colpos = 0; colpos < arr.length; colpos++) {
                    arr[rowpos][colpos] = Integer.MIN_VALUE;
                }
            }
        } catch (NegativeArraySizeException e) {

        }
    }

    public int get(int row, int col) {

        if (row > 0 && row < arr.length && col > 0 && col < arr.length) {
            return arr[row][col];
        }
        throw new IndexOutOfBoundsException("Index out of bounds, row: " + row + " , col: " + col);
    }

    public void printArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.println(arr[row][col] + " ");

            }
        }
    }

    public boolean searchArray(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col] == value) return true;

            }

        }

        return false;
    }

    public boolean insert(int row, int col, int value) {
        if (row >= 0 && row < arr.length && col >= 0 && col < arr.length) {
            arr[row][col] = value;
        }

        throw new IndexOutOfBoundsException("Index ot of bounds, " + row + ", col: " + col);
    }


    public void deleteInArray(int row, int col) {
        if (row >= 0 && row < arr.length && col >= 0 && col < arr.length) {
            arr[row][col] = Integer.MIN_VALUE;
            return;
        }
        throw new IndexOutOfBoundsException("Index ot of bounds, " + row + ", col: " + col);
    }

    public void deleteArray() {
        arr = null;
    }
}

