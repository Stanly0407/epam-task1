package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArrayArithmeticalAverage {

    public int arithmAverageOfElements(Array array) {
        if (array.getElements().size() == 0) {
            throw new ArithmeticException("Array is Empty!");
        }

        List<Integer> elements = array.getElements();
        int elementSum = 0;
        for (Integer element : elements) {
            elementSum += element;
        }
        return elementSum / elements.size();
    }
}
