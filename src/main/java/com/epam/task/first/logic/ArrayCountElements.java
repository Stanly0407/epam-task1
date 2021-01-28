package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

// Task 1
public class ArrayCountElements {

    public int countPositiveElements(Array array) {
        List<Integer> elements = array.getElements();
        int count = 0;
        for (Integer element : elements) {
            if (element > 0) {
                count++;
            }
        }
        return count;
    }

    public int countNegativeElements(Array array) {
        List<Integer> elements = array.getElements();
        int count = 0;
        for (Integer element : elements) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }
}
