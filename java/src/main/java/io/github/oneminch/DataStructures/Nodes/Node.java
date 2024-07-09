package io.github.oneminch.DataStructures.Nodes;

public abstract class Node<T> {
    protected final T value;

    public Node(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return this.value;
    }
    
    public abstract boolean hasNextNode();
    
    public abstract void setNextNode(Node<T> node);
    
    public abstract Node<T> getNextNode();
}
