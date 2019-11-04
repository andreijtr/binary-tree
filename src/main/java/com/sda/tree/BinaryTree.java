package com.sda.tree;

public class BinaryTree {
    private Node root;

    public void add(Integer value) {
        Node newNode = new Node(value);
        boolean isAdded = false;

        if (root == null) {
            root = newNode;
        } else {
            Node actualNode = root;

            while (!isAdded)
            if (actualNode.getValue() <= newNode.getValue()) {
                if (actualNode.getRightChild() == null) {
                    actualNode.setRightChild(newNode);
                    isAdded = true;
                } else {
                    actualNode = actualNode.getRightChild();
                }
            } else {
                if (actualNode.getLeftChild() == null) {
                    actualNode.setLeftChild(newNode);
                    isAdded = true;
                } else {
                    actualNode = actualNode.getLeftChild();
                }
            }
        }
    }

    public void addRecursive(int value) {
        root = addRecursiveHelper(root, value);
    }

    private Node addRecursiveHelper(Node actual, int value) {
        if(actual == null) {
            return new Node(value);
        }
        if (value <= actual.getValue()) {
            actual.setLeftChild(addRecursiveHelper(actual.getLeftChild(), value));
        } else {
           actual.setRightChild(addRecursiveHelper(actual.getRightChild(), value));
        }
        return actual;
    }

    public boolean contains(int value) {
        return containsHelper(root, value);
    }

    private boolean containsHelper(Node actual, int value) {
        if(actual == null) {
            return false;
        }
        if (actual.getValue() == value) {
            return true;
        }
        if (value <= actual.getValue()) {
            return containsHelper(actual.getLeftChild(), value);
        } else {
            return containsHelper(actual.getRightChild(), value);
        }
    }

    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.getLeftChild());
            System.out.println(root.getValue());
            inOrderTraversal(root.getRightChild());
        }
    }

    public void preOrderTraversal (Node root) {
        if(root != null) {
            System.out.println(root.getValue());
            preOrderTraversal(root.getLeftChild());
            preOrderTraversal(root.getRightChild());
        }
    }

    public void postOrderTraversal() {
        postOrderHelper(root);
    }

    private void postOrderHelper(Node actual) {
        if(actual != null) {
            postOrderHelper(actual.getLeftChild());
            postOrderHelper(actual.getRightChild());
            System.out.println(actual.getValue());
        }
    }

    public Node getRoot() {
        return root;
    }
}
