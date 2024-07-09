package io.github.oneminch.DataStructures.Nodes;

public class DoublyLinkedNode<T> extends Node<T> {
    protected DoublyLinkedNode<T> nextNode;
    protected DoublyLinkedNode<T> prevNode;
    
    public DoublyLinkedNode(T value) {
        super(value);
    }

    @Override
    public boolean hasNextNode() {
        return this.nextNode != null;
    }

    @Override
    public void setNextNode(Node<T> node) {
        if (node instanceof DoublyLinkedNode || node == null) {
            this.nextNode = (DoublyLinkedNode<T>)node;
        } else {
            throw new IllegalArgumentException("Invalid Argument");
        }
    }

    @Override
    public DoublyLinkedNode<T> getNextNode() {
        return this.nextNode;
    }

    public boolean hasPrevNode() {
        return this.prevNode != null;
    }

    public void setPrevNode(DoublyLinkedNode<T> node) {
        this.prevNode = node;
    }

    public DoublyLinkedNode<T> getPrevNode() {
        return this.prevNode;
    }
}
