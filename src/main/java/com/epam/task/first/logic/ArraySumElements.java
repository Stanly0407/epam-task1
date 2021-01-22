package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ArraySumElements {

    public int sumArrayElements(Array array) {
        List<Integer> elements = array.getElements();
        int elementSum = 0;
        for (Integer element : elements) {
            elementSum += element;
        }
        return elementSum;
    }
}
