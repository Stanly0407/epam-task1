package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArraySearchMaxMin {

    public void sortArray(List<Integer> elements) {
        int i, j, temporary;

        for (i = 0; i < (elements.size() - 1); i++) {
            for (j = 0; j < elements.size() - i - 1; j++) {
                if (elements.get(j) > elements.get(j + 1)) {
                    temporary = elements.get(j);
                    elements.set(j, elements.get(j + 1));
                    elements.set(j + 1, temporary);
                }
            }
        }
    }

    public int findMax(Array array) {
        if (array.getElements().size() == 0) {
            throw new IndexOutOfBoundsException("Array is empty!");
        }
        List<Integer> elements = array.getElements();
        sortArray(elements);
        return elements.get(elements.size() - 1);
    }

    public int findMin(Array array) {
        if (array.getElements().size() == 0) {
            throw new IndexOutOfBoundsException("Array is empty!");
        }
        List<Integer> elements = array.getElements();
        sortArray(elements);
        return elements.get(0);
    }

}

