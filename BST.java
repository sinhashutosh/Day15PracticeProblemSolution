package org.example;

public class BST {
    public static void main(String[] args) {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.addData(56);
        myBinaryTree.addData(30);
        myBinaryTree.addData(70);
        int size = myBinaryTree.getSize();
        System.out.println("size= " + size);
    }
}
