package com.sda.tree;

import java.util.List;

public class Node {
    private Integer value;
    private Node leftChild;
    private Node rightChild;

    public Node(Integer value) {
        this.value = value;
    }

    public Node() {
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
