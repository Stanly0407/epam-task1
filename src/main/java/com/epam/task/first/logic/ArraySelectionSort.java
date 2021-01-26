package com.epam.task.first.logic;

import java.util.List;

public class ArraySelectionSort {

    public void sortArrayBySelectionSort(List<Integer> elements) {

        for (int min = 0; min < elements.size() - 1; min++) {
            int minElement = min;
            for (int i = min + 1; i < elements.size(); i++) {
                if (elements.get(i) < elements.get(minElement)) {
                    minElement = i;
                }
            }
            int temporaryElement = elements.get(min);
            elements.set(min, elements.get(minElement));
            elements.set(minElement, temporaryElement);
        }
    }
}