package io.github.oneminch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.github.oneminch.Algorithms.*;

public class Main {
    public static void main(String[] args) {
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

        if (Algorithms.recursiveBinarySearch(list, 12))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}