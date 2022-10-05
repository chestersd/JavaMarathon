package org.chester_sd.day10;

public class Node {
    public int key;
    public String data;
    public Node leftChild;
    public Node rightChild;

    public void printNode(){
        System.out.println("KEY " + key + " DATA: " + data);
    }
}
