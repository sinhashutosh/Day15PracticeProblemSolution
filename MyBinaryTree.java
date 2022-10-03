package org.example;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void addData(K key) {
        this.root = this.addDataRecursively(root, key);
    }

    private MyBinaryNode<K> addDataRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<K>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        if (compareResult < 0) {
            current.left = addDataRecursively(current.left, key);
        } else {
            current.right = addDataRecursively(current.right, key);
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
    }

    private MyBinaryNode<K> searchRecursive(K key) {
        MyBinaryNode<K> currentNode = this.root;
        while (currentNode != null && currentNode != key) {
            if (key.compareTo(currentNode.key) < 0) {
                currentNode = currentNode.left;
                return currentNode;
            } else {
                currentNode = currentNode.right;
            }
        }
        return currentNode;
    }

    public boolean search(K key) {
        MyBinaryNode<K> currentNode = this.searchRecursive(key);
        if (currentNode != null)
            return true;
        return false;
    }
}