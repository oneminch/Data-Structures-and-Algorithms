package io.github.oneminch.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    private SinglyLinkedList<String> stringSinglyLinkedList;
    private SinglyLinkedList<Number> numberSinglyLinkedList;

    @BeforeEach
    void setUp() {
        stringSinglyLinkedList = new SinglyLinkedList<>("John");
        numberSinglyLinkedList = new SinglyLinkedList<>(4);
    }

    @DisplayName("Append Nodes to Singly Linked List")
    @Test
    void appendNode() {
        List<String> strList = new ArrayList<>();
        strList.add("John");
        strList.add("Doe");
        strList.add("Smith");

        stringSinglyLinkedList.appendNode("Doe");
        stringSinglyLinkedList.appendNode("Smith");
        assertEquals(3, stringSinglyLinkedList.getLength());
        assertEquals(strList, stringSinglyLinkedList.listify());

        List<Number> numList = new ArrayList<>();
        numList.add(4);
        numList.add(9);
        numList.add(7);
        numList.add(13);
        numberSinglyLinkedList.appendNode(9);
        numberSinglyLinkedList.appendNode(7);
        numberSinglyLinkedList.appendNode(13);
        assertEquals(4, numberSinglyLinkedList.getLength());
        assertEquals(numList, numberSinglyLinkedList.listify());

        stringSinglyLinkedList.print();
        numberSinglyLinkedList.print();
    }

    @DisplayName("Prepend Nodes to Singly Linked List")
    @Test
    void prependNode() {
        List<String> strList = new ArrayList<>();
        strList.add("Smith");
        strList.add("Doe");
        strList.add("John");

        stringSinglyLinkedList.prependNode("Doe");
        stringSinglyLinkedList.prependNode("Smith");

        assertEquals(3, stringSinglyLinkedList.getLength());
        assertEquals(strList, stringSinglyLinkedList.listify());

        List<Number> numList = new ArrayList<>();
        numList.add(13);
        numList.add(7);
        numList.add(9);
        numList.add(4);

        numberSinglyLinkedList.prependNode(9);
        numberSinglyLinkedList.prependNode(7);
        numberSinglyLinkedList.prependNode(13);

        assertEquals(4, numberSinglyLinkedList.getLength());
        assertEquals(numList, numberSinglyLinkedList.listify());

        stringSinglyLinkedList.print();
        numberSinglyLinkedList.print();
    }

    @DisplayName("Delete Node from Singly Linked List")
    @Test
    void deleteNode() {
        List<String> strList = new ArrayList<>();
        strList.add("John");
        strList.add("Doe");
        strList.add("Jane");
        strList.add("Smith");
        strList.add("Alice");
        // strList.add("Bob");
        strList.add("David");
        strList.add("Charlie");

        stringSinglyLinkedList.appendNode("Doe");
        stringSinglyLinkedList.appendNode("Jane");
        stringSinglyLinkedList.appendNode("Smith");
        stringSinglyLinkedList.appendNode("Alice");
        stringSinglyLinkedList.appendNode("Bob");
        stringSinglyLinkedList.appendNode("David");
        stringSinglyLinkedList.appendNode("Charlie");

        stringSinglyLinkedList.deleteNode("Bob");
        stringSinglyLinkedList.deleteNode("Bobby");

        assertEquals(strList, stringSinglyLinkedList.listify());
        assertEquals(7, stringSinglyLinkedList.getLength());

        List<Number> numList = new ArrayList<>();
        numList.add(4);
        numList.add(9);
        numList.add(7);
        // numList.add(13);
        numList.add(45);
        numList.add(23);
        numList.add(19);
        numList.add(61);

        numberSinglyLinkedList.appendNode(9);
        numberSinglyLinkedList.appendNode(7);
        numberSinglyLinkedList.appendNode(13);
        numberSinglyLinkedList.appendNode(45);
        numberSinglyLinkedList.appendNode(23);
        numberSinglyLinkedList.appendNode(19);
        numberSinglyLinkedList.appendNode(61);

        numberSinglyLinkedList.deleteNode(13);
        numberSinglyLinkedList.deleteNode(31);

        assertEquals(numList, numberSinglyLinkedList.listify());
        assertEquals(7, numberSinglyLinkedList.getLength());

        stringSinglyLinkedList.print();
        numberSinglyLinkedList.print();
    }

    @DisplayName("Search Node in Singly Linked List")
    @Test
    void searchNode() {
        stringSinglyLinkedList.appendNode("Doe");
        stringSinglyLinkedList.appendNode("Jane");
        stringSinglyLinkedList.appendNode("Smith");
        stringSinglyLinkedList.appendNode("Alice");
        stringSinglyLinkedList.appendNode("Bob");
        stringSinglyLinkedList.appendNode("David");
        stringSinglyLinkedList.appendNode("Charlie");

        assertTrue(stringSinglyLinkedList.searchNode("Bob"));
        assertFalse(stringSinglyLinkedList.searchNode("Jim"));

        stringSinglyLinkedList.deleteNode("David");
        assertFalse(stringSinglyLinkedList.searchNode("David"));

        numberSinglyLinkedList.appendNode(9);
        numberSinglyLinkedList.appendNode(7);
        numberSinglyLinkedList.appendNode(13);
        numberSinglyLinkedList.appendNode(45);
        numberSinglyLinkedList.appendNode(23);
        numberSinglyLinkedList.appendNode(19);
        numberSinglyLinkedList.appendNode(61);

        assertTrue(numberSinglyLinkedList.searchNode(45));
        assertFalse(numberSinglyLinkedList.searchNode(54));

        numberSinglyLinkedList.deleteNode(13);
        assertFalse(numberSinglyLinkedList.searchNode(13));
    }
}