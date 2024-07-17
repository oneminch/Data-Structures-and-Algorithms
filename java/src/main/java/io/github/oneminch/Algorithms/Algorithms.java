package io.github.oneminch.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algorithms {
    private static Map<Integer, Integer> fibCache;

    static {
        fibCache = new HashMap<>();
        fibCache.put(0, 0);
        fibCache.put(1, 1);
    }

    public static int iterativeFibonacci(int n) {
        if (n < 2) {
            return n;
        }

        int nMinusOne = 0;
        int nMinusTwo = 1;

        for (int i = 2; i <= n; i++) {
            int temp = nMinusOne + nMinusTwo;
            nMinusOne = nMinusTwo;
            nMinusTwo = temp;
        }

        return nMinusTwo;
    }

    public static int recursiveFibonacci(int n) {
        if (n < 2 || fibCache.containsKey(n)) {
            return fibCache.get(n);
        }

        int fib = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        fibCache.put(n, fib);

        return fib;
    }

    public static <T extends Comparable<? super T>> boolean recursiveBinarySearch(List<T> list, T target) {
        int listSize = list.size();

        if (listSize == 1)
            return target.equals(list.get(0));

        int midpoint = listSize / 2;

        if (list.get(midpoint).compareTo(target) == 0)
            return true;
        else if (list.get(midpoint).compareTo(target) < 0)
            return recursiveBinarySearch(list.subList(midpoint + 1, listSize), target);
        else
            return recursiveBinarySearch(list.subList(0, midpoint), target);

    }

    public static <T extends Comparable<? super T>> boolean iterativeBinarySearch(List<T> list, T target) {
        int low = 0;
        int high = list.size() - 1;
        int midpoint = 0;

        if (list.size() == 1)
            return target.equals(list.get(0));

        do {
            midpoint = (high + low) / 2;

            if (target.compareTo(list.get(midpoint)) == 0)
                return true;
            else if (target.compareTo(list.get(midpoint)) > 0)
                low = midpoint + 1;
            else
                high = midpoint - 1;
        } while (low <= high);

        return false;
    }

    public static <T extends Number & Comparable<T>> List<T> selectionSort(List<T> list) {
        int size = list.size();

        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }

        return list;
    }

    public static <T extends Number & Comparable<T>> List<T> bubbleSort(List<T> list) {
        int size = list.size();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        return list;
    }

    public static <T extends Number & Comparable<T>> List<T> quickSort(List<T> list) {
        int size = list.size();

        if (size < 2) {
            return list;
        }

        List<T> pivot = new ArrayList<>(Arrays.asList(list.get(0)));
        List<T> lesser = new ArrayList<>();
        List<T> greater = new ArrayList<>();

        for (int i = 1; i < size; i++) {
            if (list.get(i).compareTo(pivot.get(0)) <= 0) {
                lesser.add(list.get(i));
            }
        }

        for (int i = 1; i < size; i++) {
            if (list.get(i).compareTo(pivot.get(0)) > 0) {
                greater.add(list.get(i));
            }
        }

        List<T> sortedLesser = quickSort(lesser);
        sortedLesser.addAll(pivot);
        sortedLesser.addAll(quickSort(greater));

        return sortedLesser;
    }
}
