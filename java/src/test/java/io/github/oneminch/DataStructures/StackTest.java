package io.github.oneminch.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class StackTest {
    private Stack<Number> s;

    @BeforeEach
    void setUp() {
        s = new Stack<>();
    }

    @Test
    public void testPush() {
        s.push(3);

        assertEquals(3, s.getStack().get(0));

        s.push(6);
        List<Number> currentStack = s.getStack();
        assertEquals(6, currentStack.get(s.getSize() - 1));

    }

    @Test
    public void testPop() {
        assertNull(s.pop());

        s.push(3);
        assertEquals(3, s.pop());
        assertTrue(s.isEmpty());

        s.push(6);
        s.push(7);
        assertEquals(7, s.pop());
        assertEquals(1, s.getSize());
    }

    @Test
    public void testPeek() {
        s.push(3);
        s.push(7);
        s.push(9);
        s.push(0);

        assertEquals(0, s.peek());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(s.isEmpty());

        s.push(5);
        assertFalse(s.isEmpty());

        s.pop();
        assertTrue(s.isEmpty());
    }
}