package com.epam.task.first.logic;

import java.util.List;

public class ArrayInsertionSort {

    public void sortArrayByInsertionSort(List<Integer> elements) {
        for (int i = 1; i < elements.size(); i++) {
            int current = elements.get(i);
            int j = i - 1;
            while (j >= 0 && current < elements.get(j)) {
                elements.set(j + 1, elements.get(j));
                j--;
            }
            elements.set(j + 1, current);
        }
    }
}
