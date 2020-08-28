package com.sparta.dt.sort_algorithms.BinaryTreeSort;

import com.sparta.dt.sort_algorithms.SortAlgorithm;

public class BinaryTreeSort implements BinaryTree, SortAlgorithm {

    private int[] toSort;
    private int[] sorted;
    private Node root;

    public BinaryTreeSort() {
    }

    private BinaryTreeSort(int[] toSort) {
        this.toSort = toSort.clone();
        // form binary tree
        sorted = new int[toSort.length];
        addElements(toSort);
    }

    @Override
    public int getRootElement() {
        return root.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return toSort.length;
    }

    @Override
    public void addElement(int element) {
        root = recursiveAdd(root, element);
    }

    private Node recursiveAdd(Node current, int element) {
        if (current == null) {
            return new Node(element);
        }
        if (element <= current.getValue()) {
            current.setLeftChild(recursiveAdd(current.getLeftChild(), element));
        } else if (element > current.getValue()) {
            current.setRightChild(recursiveAdd(current.getRightChild(), element));
        }
        return current;
    }

    @Override
    public void addElements(int[] elements) {
        for (int i : elements) {
            addElement(i);
        }
    }

    private boolean recursiveFindElement(Node current, int element) {
        if (current == null) {
            return false;
        }
        if (element == current.getValue()) {
            return true;
        }
        if (element < current.getValue()) {
            recursiveFindElement(current.getLeftChild(), element);
        } else if (element > current.getValue()) {
            recursiveFindElement(current.getRightChild(), element);
        }
        return false;
    }

    @Override
    public boolean findElement(int value) {
        return recursiveFindElement(root, value);
    }

    private Node recursiveGetNode(Node current, int element) {
        if (current == null) {
            return null;
        }
        if (current.getValue() == element) {
            return current;
        }
        if (element < current.getValue()) {
            recursiveGetNode(current.getLeftChild(), element);
        } else if (element > current.getValue()) {
            recursiveGetNode(current.getRightChild(), element);
        }
        return null;
    }


    @Override
    public int getLeftChild(int element) throws ChildNotFoundException, NodeDoesNotExistException {
        if (findElement(element)) {
            Node elementNode = recursiveGetNode(root, element);
            if (elementNode.getLeftChild() != null) {
                return elementNode.getLeftChild().getValue();
            } else {
                throw new ChildNotFoundException();
            }
        } else {
            throw new NodeDoesNotExistException();
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException, NodeDoesNotExistException {
        if (findElement(element)) {
            Node elementNode = recursiveGetNode(root, element);
            if (elementNode.getRightChild() != null) {
                return elementNode.getRightChild().getValue();
            } else {
                throw new ChildNotFoundException();
            }
        } else {
            throw new NodeDoesNotExistException();
        }
    }

    private int indexAsc = 0;

    private void recursionSortTreeAsc(Node current) {
        if (current != null) {
            recursionSortTreeAsc(current.getLeftChild());
            sorted[indexAsc] = current.getValue();
            indexAsc++;
            recursionSortTreeAsc(current.getRightChild());
        }
    }

    private int indexDesc = 0;

    private void recursionSortTreeDesc(Node current) {
        if (current != null) {
            recursionSortTreeAsc(current.getRightChild());
            sorted[indexDesc] = current.getValue();
            indexDesc++;
            recursionSortTreeAsc(current.getLeftChild());
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        recursionSortTreeAsc(root);
        return sorted;
    }

    @Override
    public int[] getSortedTreeDesc() {
        recursionSortTreeDesc(root);
        return sorted;
    }

    @Override
    public int[] performSortAlgorithm(int[] toSort) {
        BinaryTreeSort bts = new BinaryTreeSort(toSort);
        return bts.getSortedTreeAsc();
    }

    @Override
    public String getName() {
        return "Binary Tree Sort";
    }

}
