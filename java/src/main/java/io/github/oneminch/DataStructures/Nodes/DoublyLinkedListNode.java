package io.github.oneminch.DataStructures.Nodes;

public class DoublyLinkedListNode<T> extends LinkedListNode<T> {
    private DoublyLinkedListNode<T> nextNode;
    private DoublyLinkedListNode<T> prevNode;

    public DoublyLinkedListNode(T value) {
        super(value);
        this.prevNode = null;
    }

    public boolean hasPrevNode() {
        return this.prevNode != null;
    }

    public boolean hasNextNode() {
        return this.nextNode != null;
    }

    public void setNextNode(DoublyLinkedListNode<T> node) {
        this.nextNode = node;
    }

    public void setPrevNode(DoublyLinkedListNode<T> node) {
        this.prevNode = node;
    }

    public DoublyLinkedListNode<T> getNextNode() {
        return this.nextNode;
    }

    public DoublyLinkedListNode<T> getPrevNode() {
        return this.prevNode;
    }
}
