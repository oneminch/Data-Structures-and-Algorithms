package io.github.oneminch.Algorithms;

import java.util.List;

public class Algorithms {
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
}
