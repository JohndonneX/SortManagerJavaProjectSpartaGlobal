package com.sparta.dt.sort_algorithms.BinaryTreeSort;

public class Node {
    private final int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public boolean isLeftChildEmpty() {
        if (leftChild == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRightChildEmpty() {
        if (rightChild == null) {
            return true;
        } else {
            return false;
        }
    }
}
