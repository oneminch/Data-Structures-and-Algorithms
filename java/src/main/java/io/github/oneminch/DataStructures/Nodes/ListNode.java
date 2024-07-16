package io.github.oneminch.DataStructures.Nodes;

public abstract class ListNode<T> {
    protected final T value;

    public ListNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public abstract boolean hasNextNode();

    public abstract void setNextNode(ListNode<T> node);

    public abstract ListNode<T> getNextNode();
}
