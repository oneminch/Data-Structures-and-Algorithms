package io.github.oneminch.DataStructures;

import io.github.oneminch.DataStructures.Nodes.DoublyLinkedListNode;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList<T> {
    private DoublyLinkedListNode<T> head;
    private DoublyLinkedListNode<T> tail;
    private List<T> list;
    private int length;

    public DoublyLinkedList(T value) {
        this.head = new DoublyLinkedListNode<>(value);
        this.tail = this.head;
        this.list = new ArrayList<>();
        this.length += 1;
    }

    public void appendNode(T item) {
        DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(item);
        newNode.setPrevNode(this.tail);
        this.tail.setNextNode(newNode);
        this.tail = newNode;
        this.length += 1;
    }

    public void prependNode(T item) {
        DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<>(item);
        newNode.setNextNode(this.head);
        this.head = newNode;
        this.length += 1;
    }

    public void deleteNode(T item) {
        if (this.length == 1) {
            return;
        }

        DoublyLinkedListNode<T> currentNode = this.head;
        DoublyLinkedListNode<T> previousNode = null;
        DoublyLinkedListNode<T> nextNode = null;
        T currentValue;

        do {
            currentValue = currentNode.getValue();
            
            if (currentValue.equals(item)) {
                previousNode = currentNode.getPrevNode();
                nextNode = currentNode.getNextNode();
                
                if (!currentNode.hasPrevNode()) {
                    nextNode.setPrevNode(null);
                    this.head = nextNode;
                } else {
                    previousNode.setNextNode(nextNode);

                    if (currentNode.hasNextNode()) {
                        nextNode.setPrevNode(previousNode);
                    } else {
                        this.tail = previousNode;
                    }

                }
                currentNode.setNextNode(null);
                currentNode.setPrevNode(null);
                
                this.length -= 1;
                return;
            }
            currentNode = currentNode.getNextNode();
        } while (currentNode != null);
    }

    public boolean searchNode(T item) {
        DoublyLinkedListNode<T> currentNode = this.head;
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
        DoublyLinkedListNode<T> currentNode = this.head;

        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " <-> ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println("∅");
    }

    public List<T> listify() {
        DoublyLinkedListNode<T> currentNode = this.head;

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
