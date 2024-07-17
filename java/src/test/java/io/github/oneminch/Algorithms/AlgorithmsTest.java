package io.github.oneminch.Algorithms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgorithmsTest {
    private static List<Integer> unsortedNumList;
    private static List<Integer> sortedNumList;
    private static List<String> sortedStrList;

    @BeforeAll
    static void setUp() {
        unsortedNumList = new ArrayList<>();
        unsortedNumList.add(51);
        unsortedNumList.add(21);
        unsortedNumList.add(35);
        unsortedNumList.add(14);
        unsortedNumList.add(31);
        unsortedNumList.add(39);
        unsortedNumList.add(12);
        unsortedNumList.add(10);
        unsortedNumList.add(77);
        unsortedNumList.add(19);
        unsortedNumList.add(71);
        unsortedNumList.add(61);

        sortedNumList = new ArrayList<>();
        sortedNumList.add(10);
        sortedNumList.add(12);
        sortedNumList.add(14);
        sortedNumList.add(19);
        sortedNumList.add(21);
        sortedNumList.add(31);
        sortedNumList.add(35);
        sortedNumList.add(39);
        sortedNumList.add(51);
        sortedNumList.add(61);
        sortedNumList.add(71);
        sortedNumList.add(77);
        Collections.sort(sortedNumList);

        sortedStrList = new ArrayList<>();
        sortedStrList.add("Alice");
        sortedStrList.add("Bob");
        sortedStrList.add("Charlie");
        sortedStrList.add("David");
        sortedStrList.add("Doe");
        sortedStrList.add("Jane");
        sortedStrList.add("John");
        sortedStrList.add("Smith");
        Collections.sort(sortedStrList);
    }

    @ParameterizedTest(name = "Fibonacci({0}) = {1}")
    @CsvSource({ "3, 2", "6, 8", "9, 34", "15, 610" })
    void testIterativeFibonacci(int n, int expected) {
        assertEquals(expected, Algorithms.iterativeFibonacci(n));
    }

    @ParameterizedTest(name = "Fibonacci({0}) = {1}")
    @CsvSource({ "3, 2", "6, 8", "9, 34", "15, 610" })
    void testRecursiveFibonacci(int n, int expected) {
        assertEquals(expected, Algorithms.recursiveFibonacci(n));
    }

    @Test
    void testRecursiveBinarySearch() {
        // Integer Tests
        assertTrue(Algorithms.recursiveBinarySearch(sortedNumList, 12));
        assertFalse(Algorithms.recursiveBinarySearch(sortedNumList, 25));

        // String Tests
        assertTrue(Algorithms.recursiveBinarySearch(sortedStrList, "Jane"));
        assertFalse(Algorithms.recursiveBinarySearch(sortedStrList, "Elliot"));
    }

    @Test
    void testIterativeBinarySearch() {
        // Integer Tests
        assertTrue(Algorithms.iterativeBinarySearch(sortedNumList, 12));
        assertFalse(Algorithms.iterativeBinarySearch(sortedNumList, 25));

        // String Tests
        assertTrue(Algorithms.iterativeBinarySearch(sortedStrList, "Jane"));
        assertFalse(Algorithms.iterativeBinarySearch(sortedStrList, "Elliot"));
    }

    @Test
    void testSelectionSort() {
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(51);
        sortedList.add(21);
        sortedList.add(35);
        sortedList.add(14);
        sortedList.add(31);
        sortedList.add(39);
        sortedList.add(12);
        sortedList.add(10);
        sortedList.add(77);
        sortedList.add(19);
        sortedList.add(71);
        sortedList.add(61);
        sortedList.sort(null);

        Object[] expected = sortedList.toArray();
        Object[] actual = Algorithms.selectionSort(unsortedNumList).toArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    void testBubbleSort() {
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(51);
        sortedList.add(21);
        sortedList.add(35);
        sortedList.add(14);
        sortedList.add(31);
        sortedList.add(39);
        sortedList.add(12);
        sortedList.add(10);
        sortedList.add(77);
        sortedList.add(19);
        sortedList.add(71);
        sortedList.add(61);
        sortedList.sort(null);

        Object[] expected = sortedList.toArray();
        Object[] actual = Algorithms.bubbleSort(unsortedNumList).toArray();
        assertArrayEquals(expected, actual);
    }

    @Test
    void testQuickSort() {
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(51);
        sortedList.add(21);
        sortedList.add(35);
        sortedList.add(14);
        sortedList.add(31);
        sortedList.add(39);
        sortedList.add(12);
        sortedList.add(10);
        sortedList.add(77);
        sortedList.add(19);
        sortedList.add(71);
        sortedList.add(61);
        sortedList.sort(null);

        Object[] expected = sortedList.toArray();
        Object[] actual = Algorithms.quickSort(unsortedNumList).toArray();
        assertArrayEquals(expected, actual);
    }
}
