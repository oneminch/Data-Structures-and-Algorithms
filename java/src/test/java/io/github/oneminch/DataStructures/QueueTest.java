package io.github.oneminch.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class QueueTest {
    private Queue<Number> q;
    
    @BeforeEach
    void setUp() {
        q = new Queue<>();
    }

    @Test
    public void testEnqueue() {
        q.enqueue(3);
        assertEquals(3, q.getQueue().get(0));

        q.enqueue(6);
        List<Number> currentQueue = q.getQueue();
        assertEquals(6, currentQueue.get(q.getSize() - 1));
    }

    @Test
    public void testDequeue() {
        assertNull(q.dequeue());

        q.enqueue(3);
        assertEquals(3, q.dequeue());
        assertTrue(q.isEmpty());

        q.enqueue(6);
        q.enqueue(7);
        assertEquals(6, q.dequeue());
        assertEquals(1, q.getSize());
    }

    @Test
    public void testPeek() {
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(0);

        assertEquals(3, q.peek());
    }

    @Test
    public void testIsEmpty() {
        boolean expected = true;
        boolean actual = q.isEmpty();
        assertTrue(q.isEmpty());

        q.enqueue(5);
        assertFalse(q.isEmpty());
    }
}