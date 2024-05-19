package io.github.oneminch.Algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgorithmsTest {

    @Test
    public void testRecursiveBinarySearch() {
        List<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(71);
        list.add(14);
        list.add(21);
        list.add(35);
        list.add(12);
        list.add(51);
        list.add(61);
        list.add(19);
        list.add(10);
        list.add(39);
        list.add(77);
        Collections.sort(list);

        boolean actual = Algorithms.recursiveBinarySearch(list, 12);
        boolean expected = true;

        assertEquals(expected, actual);
    }
}