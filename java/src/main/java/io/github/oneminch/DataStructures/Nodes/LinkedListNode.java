package io.github.oneminch.DataStructures.Nodes;

public class LinkedListNode<T> {
    private final T value;
    private LinkedListNode<T> nextNode;

    public LinkedListNode(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public boolean hasNextNode() {
        return this.nextNode != null;
    }

    public void setNextNode(LinkedListNode<T> node) {
        this.nextNode = node;
    }

    public LinkedListNode<T> getNextNode() {
        return this.nextNode;
    }

    public T getValue() {
        return this.value;
    }
}
