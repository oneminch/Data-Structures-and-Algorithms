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
    private static List<Integer> numList;
    private static List<String> strList;

    @BeforeAll
    static void setUp() {
        numList = new ArrayList<>();
        numList.add(10);
        numList.add(12);
        numList.add(14);
        numList.add(19);
        numList.add(21);
        numList.add(31);
        numList.add(35);
        numList.add(39);
        numList.add(51);
        numList.add(61);
        numList.add(71);
        numList.add(77);
        Collections.sort(numList);

        strList = new ArrayList<>();
        strList.add("Alice");
        strList.add("Bob");
        strList.add("Charlie");
        strList.add("David");
        strList.add("Doe");
        strList.add("Jane");
        strList.add("John");
        strList.add("Smith");
        Collections.sort(strList);
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
        assertTrue(Algorithms.recursiveBinarySearch(numList, 12));
        assertFalse(Algorithms.recursiveBinarySearch(numList, 25));

        // String Tests
        assertTrue(Algorithms.recursiveBinarySearch(strList, "Jane"));
        assertFalse(Algorithms.recursiveBinarySearch(strList, "Elliot"));
    }

    @Test
    void testIterativeBinarySearch() {
        // Integer Tests
        assertTrue(Algorithms.iterativeBinarySearch(numList, 12));
        assertFalse(Algorithms.iterativeBinarySearch(numList, 25));

        // String Tests
        assertTrue(Algorithms.iterativeBinarySearch(strList, "Jane"));
        assertFalse(Algorithms.iterativeBinarySearch(strList, "Elliot"));
    }
}
