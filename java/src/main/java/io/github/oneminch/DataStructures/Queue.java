package io.github.oneminch.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private final List<T> q;
    private int size;

    public Queue() {
        this.q = new ArrayList<T>();
        this.size = 0;
    }

    public void enqueue(T item) {
        this.q.add(item);
        this.size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        this.size--;
        return this.q.remove(0);
    }

    public T peek() {
        return this.q.get(0);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public List<T> getQueue() {
        return this.q;
    }
}
