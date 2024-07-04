package io.github.oneminch.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> s;
    private int size;

    public Stack() {
        this.s = new ArrayList<T>();
        this.size = 0;
    }

    public void push(T item) {
        this.s.add(item);
        this.size++;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        int currentSize = this.size;
        this.size--;
        return this.s.remove(currentSize - 1);
    }

    public T peek() {
        return this.s.get(getSize() - 1);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public List<T> getStack() {
        return this.s;
    }
}
