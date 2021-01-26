package com.epam.task.first.logic;

import java.util.List;

public class ArrayBubbleSort {

    public void sortArrayByBubbleSort(List<Integer> elements) {

        for (int i = 0; i < (elements.size() - 1); i++) {
            for (int j = (elements.size() - 1); j > i; j--) {
                if (elements.get(j - 1) > elements.get(j)) {
                    int temporary = elements.get(j - 1);
                    elements.set(j - 1, elements.get(j));
                    elements.set(j, temporary);
                }
            }
        }
    }
}
