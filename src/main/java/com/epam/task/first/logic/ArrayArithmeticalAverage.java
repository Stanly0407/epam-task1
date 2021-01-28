package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

// Task 1
public class ArrayArithmeticalAverage {

    public int arithmAverageOfElements(Array array) {
        List<Integer> elements = array.getElements();
        if (elements.size() == 0) {
            throw new ArithmeticException("Array is Empty!");
        }
        int elementSum = 0;
        for (Integer element : elements) {
            elementSum += element;
        }
        return elementSum / elements.size();
    }
}
