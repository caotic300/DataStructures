package com.Pedro.DataStructures;

import java.util.Random;

public class IntSkipList {
    private int maxLevel;
    private IntSkipListNode[] root;
    private int[] powers;
    private Random rd = new Random();

    IntSkipList() {
        this(4);
    }

    IntSkipList(int i) {
        maxLevel = i;
        root = new IntSkipListNode[maxLevel];
        powers = new int[maxLevel];
        for (int j = 0; j < maxLevel; j++)
            root[j] = null;
        choosePowers();
    }

    public void choosePowers() {
        powers[maxLevel - 1] = (2 << (maxLevel - 1)) - 1; //2^maxLevel - 1
        for (int i = maxLevel - 2, j = 0; i >= 0; i--, j++)
            powers[i] = powers[i+1] - (2 << j);
    }

    public int chooseLevel() {
        int i, r = Math.abs(rd.nextInt() % powers[maxLevel - 1] + 1);
        for (i = 1; i < maxLevel; i++)
            if (r < powers[i])
                return i - 1; // return a level < the highest level;
        return i - 1; // return the highest level
    }

    public int skipListSearch(int key) {
        int lvl;
        IntSkipListNode prev, curr;

        for (lvl = maxLevel - 1; lvl >= 0 && root[lvl] == null; lvl--); //find the highest non-null level
        prev = curr = root[lvl];

        while (true) { //success if equal
            if (key == curr.key)
                return curr.key;
            else if (key < curr.key) { //if smaller, go down.
                if (lvl == 0) //if possible
                    return 0;
                else if (curr == root[lvl])
                    curr = root[--lvl]; //by one level starting from the predecessor which can de the root
                else curr = prev.next[--lvl];
            } else {                         //if greater,
                prev = curr;                 //go to next
                if (curr.next[lvl] != null)  //non-null node
                    curr = curr.next[lvl];   //on the same level
                else {                       //or to a list in a lower level
                    for (lvl--; lvl >= 0 && curr.next[lvl] == null; lvl--);
                    if (lvl >= 0)
                        curr = curr.next[lvl];
                    else return 0;
                }
            }
        }
    }

    public void skipListInsert(int key) {
        IntSkipListNode[] curr = new IntSkipListNode[maxLevel];
        IntSkipListNode[] prev = new IntSkipListNode[maxLevel];
        IntSkipListNode newNode;

        int lvl, i;

        curr[maxLevel - 1] = root[maxLevel - 1];
        prev[maxLevel - 1] = null;
        for (lvl = maxLevel - 1; lvl >= 0; lvl--) {
            while (curr[lvl] != null && curr[lvl].key < key) { //go to the next if smaller
                prev[lvl] = curr[lvl];
                curr[lvl] = curr[lvl].next[lvl];
            }

            if (curr[lvl] != null && curr[lvl].key == key){//don't include duplicates
                return;
            }

            if (lvl > 0)                            //go one level down
                if (prev[lvl] == null){             //if not the lowest
                    curr[lvl - 1] = root[lvl - 1];  //level, using a link
                    prev[lvl - 1] = null;           //either from the root
                } else {                            //or from predecessor
                    curr[lvl - 1] = prev[lvl].next[lvl - 1];
                    prev[lvl - 1] = prev[lvl];
                }
        }
        lvl = chooseLevel();

        newNode = new IntSkipListNode(key, lvl + 1);
        for (i = 0; i <= lvl; i++) {        //initialize next field of
            newNode.next[i] = curr[i];      //newNode and reset to newNode
            if (prev[i] == null)            //either fields of the root
                root[i] = newNode;          //or next field of newNode's
            else prev[i].next[i] = newNode; //predecessor
        }
    }
}
