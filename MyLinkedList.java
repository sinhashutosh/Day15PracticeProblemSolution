package org.example;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void append(INode<K> INode) {
        if (this.tail == null) {
            this.tail = INode;
        }
        if (this.head == null) {
            this.head = INode;
        } else{
            this.tail.setNext(INode);
            this.tail = INode;
        }
    }
    public INode <K> search(K key) {
        INode<K> INode = head;
        while (INode != null && INode.getNext() != null) {
            if (INode.getKey().equals(key)) {
                return INode;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyLinkedList {head=" + head + ", tail=" + tail + "}";
    }
}
