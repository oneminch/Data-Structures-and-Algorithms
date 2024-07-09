package io.github.oneminch.DataStructures.Nodes;

public class SinglyLinkedNode<T> extends Node<T> {
    protected SinglyLinkedNode<T> nextNode;
    
    public SinglyLinkedNode(T value) {
        super(value);
    }

    @Override
    public boolean hasNextNode() {
        return this.nextNode != null;
    }

    @Override
    public void setNextNode(Node<T> node) {
        if (node instanceof SinglyLinkedNode || node == null) {
            this.nextNode = (SinglyLinkedNode<T>)node;
        } else {
            throw new IllegalArgumentException("Invalid Argument");
        }
    }

    @Override
    public SinglyLinkedNode<T> getNextNode() {
        return this.nextNode;
    }
}
