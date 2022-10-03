package org.example;

public class MyLinkedList<K> {
    public INode <K> head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(INode<K> node) {
        if (this.tail == null)
            this.tail = node;
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public INode delete(K key) {
        INode<K> currentNode = head;
        INode<K> previous = null;
        while (currentNode != null && currentNode.getNext() != null) {
            previous = currentNode;
            if (currentNode.getKey().equals(key)) {
                previous.setNext(currentNode.getNext());
            }
            currentNode =currentNode.getNext();
        }
        return currentNode;
    }

    public INode<K> search(K key) {
        INode<K> node = head;
        while (node != null && node.getNext() != null) {
            if (node.getKey().equals(key)) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyLinkedList [head=" + head + ", tail=" + tail + "]";
    }
}