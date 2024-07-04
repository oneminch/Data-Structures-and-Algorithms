package io.github.oneminch.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    private DoublyLinkedList<String> stringDoublyLinkedList;
    private DoublyLinkedList<Number> numberDoublyLinkedList;

    @BeforeEach
    void setUp() {
        stringDoublyLinkedList = new DoublyLinkedList<>("John");
        numberDoublyLinkedList = new DoublyLinkedList<>(4);
    }

    @DisplayName("Append Nodes to Doubly Linked List")
    @Test
    void appendNode() {
        List<String> strList = new ArrayList<>();
        strList.add("John");
        strList.add("Doe");
        strList.add("Smith");

        stringDoublyLinkedList.appendNode("Doe");
        stringDoublyLinkedList.appendNode("Smith");
        assertEquals(3, stringDoublyLinkedList.getLength());
        assertEquals(strList, stringDoublyLinkedList.listify());

        List<Number> numList = new ArrayList<>();
        numList.add(4);
        numList.add(9);
        numList.add(7);
        numList.add(13);
        numberDoublyLinkedList.appendNode(9);
        numberDoublyLinkedList.appendNode(7);
        numberDoublyLinkedList.appendNode(13);
        assertEquals(4, numberDoublyLinkedList.getLength());
        assertEquals(numList, numberDoublyLinkedList.listify());

        stringDoublyLinkedList.print();
        numberDoublyLinkedList.print();
    }

    @DisplayName("Prepend Nodes to Doubly Linked List")
    @Test
    void prependNode() {
        List<String> strList = new ArrayList<>();
        strList.add("Smith");
        strList.add("Doe");
        strList.add("John");

        stringDoublyLinkedList.prependNode("Doe");
        stringDoublyLinkedList.prependNode("Smith");

        assertEquals(3, stringDoublyLinkedList.getLength());
        assertEquals(strList, stringDoublyLinkedList.listify());

        List<Number> numList = new ArrayList<>();
        numList.add(13);
        numList.add(7);
        numList.add(9);
        numList.add(4);

        numberDoublyLinkedList.prependNode(9);
        numberDoublyLinkedList.prependNode(7);
        numberDoublyLinkedList.prependNode(13);

        assertEquals(4, numberDoublyLinkedList.getLength());
        assertEquals(numList, numberDoublyLinkedList.listify());

        stringDoublyLinkedList.print();
        numberDoublyLinkedList.print();
    }

    @DisplayName("Delete Node from Doubly Linked List")
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

        stringDoublyLinkedList.appendNode("Doe");
        stringDoublyLinkedList.appendNode("Jane");
        stringDoublyLinkedList.appendNode("Smith");
        stringDoublyLinkedList.appendNode("Alice");
        stringDoublyLinkedList.appendNode("Bob");
        stringDoublyLinkedList.appendNode("David");
        stringDoublyLinkedList.appendNode("Charlie");

        stringDoublyLinkedList.deleteNode("Bob");
        stringDoublyLinkedList.deleteNode("Bobby");

        assertEquals(strList, stringDoublyLinkedList.listify());
        assertEquals(7, stringDoublyLinkedList.getLength());

        List<Number> numList = new ArrayList<>();
        numList.add(4);
        numList.add(9);
        numList.add(7);
        // numList.add(13);
        numList.add(45);
        numList.add(23);
        numList.add(19);
        numList.add(61);

        numberDoublyLinkedList.appendNode(9);
        numberDoublyLinkedList.appendNode(7);
        numberDoublyLinkedList.appendNode(13);
        numberDoublyLinkedList.appendNode(45);
        numberDoublyLinkedList.appendNode(23);
        numberDoublyLinkedList.appendNode(19);
        numberDoublyLinkedList.appendNode(61);

        numberDoublyLinkedList.deleteNode(13);
        numberDoublyLinkedList.deleteNode(31);

        assertEquals(numList, numberDoublyLinkedList.listify());
        assertEquals(7, numberDoublyLinkedList.getLength());

        stringDoublyLinkedList.print();
        numberDoublyLinkedList.print();
    }

    @DisplayName("Search Node in Doubly Linked List")
    @Test
    void searchNode() {
        stringDoublyLinkedList.appendNode("Doe");
        stringDoublyLinkedList.appendNode("Jane");
        stringDoublyLinkedList.appendNode("Smith");
        stringDoublyLinkedList.appendNode("Alice");
        stringDoublyLinkedList.appendNode("Bob");
        stringDoublyLinkedList.appendNode("David");
        stringDoublyLinkedList.appendNode("Charlie");

        assertTrue(stringDoublyLinkedList.searchNode("Bob"));
        assertFalse(stringDoublyLinkedList.searchNode("Jim"));

        stringDoublyLinkedList.deleteNode("David");
        assertFalse(stringDoublyLinkedList.searchNode("David"));

        numberDoublyLinkedList.appendNode(9);
        numberDoublyLinkedList.appendNode(7);
        numberDoublyLinkedList.appendNode(13);
        numberDoublyLinkedList.appendNode(45);
        numberDoublyLinkedList.appendNode(23);
        numberDoublyLinkedList.appendNode(19);
        numberDoublyLinkedList.appendNode(61);

        assertTrue(numberDoublyLinkedList.searchNode(45));
        assertFalse(numberDoublyLinkedList.searchNode(54));

        numberDoublyLinkedList.deleteNode(13);
        assertFalse(numberDoublyLinkedList.searchNode(13));
    }
}
