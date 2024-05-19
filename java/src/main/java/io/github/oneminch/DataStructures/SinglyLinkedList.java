package io.github.oneminch.DataStructures;

import io.github.oneminch.DataStructures.Nodes.LinkedListNode;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList<T> {
    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;
    private List<T> list;
    private int length;

    public SinglyLinkedList(T value) {
        this.head = new LinkedListNode<>(value);
        this.tail = this.head;
        this.list = new ArrayList<>();
        this.length += 1;
    }

    public void appendNode(T item) {
        LinkedListNode<T> newNode = new LinkedListNode<>(item);
        this.tail.setNextNode(newNode);
        this.tail = newNode;
        this.length += 1;
    }

    public void prependNode(T item) {
        LinkedListNode<T> newNode = new LinkedListNode<>(item);
        newNode.setNextNode(this.head);
        this.head = newNode;
        this.length += 1;
    }

    public void deleteNode(T item) {
        if (this.length == 1) {
            return;
        }

        LinkedListNode<T> currentNode = this.head;
        LinkedListNode<T> previousNode = null;
        T currentValue;

        do {
            currentValue = currentNode.getValue();

            if (currentValue.equals(item)) {
                if (previousNode == null) {
                    this.head = currentNode.getNextNode();
                } else {
                    previousNode.setNextNode(currentNode.getNextNode());
                }

                this.length -= 1;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        } while (currentNode != null);
    }

    public boolean searchNode(T item) {
        LinkedListNode<T> currentNode = this.head;
        T currentValue;

        while (currentNode != null) {
            currentValue = currentNode.getValue();

            if (currentValue.equals(item)) {
                return true;
            }

            currentNode = currentNode.getNextNode();
        }

        return false;
    }

    public void print() {
        LinkedListNode<T> currentNode = this.head;

        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " -> ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println("∅");
    }

    public List<T> listify() {
        LinkedListNode<T> currentNode = this.head;

        this.list.clear();
        while (currentNode != null) {
            this.list.add(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }

        return this.list;
    }

    public int getLength() {
        return this.length;
    }
}
