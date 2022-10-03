package org.example;

public class BST {
    public static void main(String[] args) {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.addData(56);
        myBinaryTree.addData(30);
        myBinaryTree.addData(70);
        myBinaryTree.addData(22);
        myBinaryTree.addData(40);
        myBinaryTree.addData(11);
        myBinaryTree.addData(3);
        myBinaryTree.addData(16);
        myBinaryTree.addData(60);
        myBinaryTree.addData(95);
        myBinaryTree.addData(65);
        myBinaryTree.addData(63);
        myBinaryTree.addData(67);
        int size = myBinaryTree.getSize();
        System.out.println("size= " + size);
    }
}
