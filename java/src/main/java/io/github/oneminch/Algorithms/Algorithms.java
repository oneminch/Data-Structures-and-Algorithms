package io.github.oneminch.Algorithms;

import java.util.List;

public class Algorithms {
    public static <T extends Number> boolean recursiveBinarySearch(List<T> list, T target) {
        int listSize = list.size();

        if (listSize == 1)
            return target.equals(list.get(0));

        int midpoint = listSize / 2;

        if (target.doubleValue() == list.get(midpoint).doubleValue())
            return true;
        else if (list.get(midpoint).doubleValue() < target.doubleValue())
            return recursiveBinarySearch(list.subList(midpoint, listSize), target);
        else
            return recursiveBinarySearch(list.subList(0, midpoint), target);

    }
}
