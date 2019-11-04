package com.sda.tree;

public class Runner {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        BinaryTree binaryTree2 = new BinaryTree();

        System.out.println("Recursive add tree:");

        binaryTree.addRecursive(10);
        binaryTree.addRecursive(16);
        binaryTree.addRecursive(7);
        binaryTree.addRecursive(9);
        binaryTree.addRecursive(12);
        binaryTree.addRecursive(24);
        binaryTree.addRecursive(5);
        binaryTree.addRecursive(6);

        binaryTree.inOrderTraversal(binaryTree.getRoot());

        System.out.println("Simple add tree:");

        binaryTree2.add(10);
        binaryTree2.add(16);
        binaryTree2.add(7);
        binaryTree2.add(9);
        binaryTree2.add(12);
        binaryTree2.add(24);
        binaryTree2.add(5);

        binaryTree2.inOrderTraversal(binaryTree2.getRoot());

        System.out.println("Post order traversal:");
        binaryTree.postOrderTraversal();

        System.out.println("In order traversal");
        binaryTree.inOrderTraversal(binaryTree.getRoot());

        System.out.println("Pre order traversal");
        binaryTree.preOrderTraversal(binaryTree.getRoot());

        System.out.println("6 exist in binary tree? " + binaryTree.contains(60));
    }
}
