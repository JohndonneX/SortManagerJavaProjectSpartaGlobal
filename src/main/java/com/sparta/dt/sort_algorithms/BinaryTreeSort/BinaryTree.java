package com.sparta.dt.sort_algorithms.BinaryTreeSort;

public interface BinaryTree {
    int getRootElement();
    int getNumberOfElements();
    void addElement(int element);
    void addElements(int[] elements);
    boolean findElement(int value);
    int getLeftChild(int element) throws ChildNotFoundException, NodeDoesNotExistException;
    int getRightChild(int element) throws ChildNotFoundException, NodeDoesNotExistException;
    int[] getSortedTreeAsc();
    int[] getSortedTreeDesc();
}
