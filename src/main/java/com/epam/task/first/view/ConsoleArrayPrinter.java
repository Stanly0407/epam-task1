package com.epam.task.first.view;

import com.epam.task.first.entities.Array;

import java.util.List;

public class ConsoleArrayPrinter implements ArrayPrinter {

    public void printArray(Array array) {
        List<Integer> elements = array.getElements();
        System.out.println("Elements:");
        if (!elements.isEmpty()) {
            for (Integer element : elements) {
                System.out.printf("%d; ", element);
            }
        } else {
            System.out.println("Array is empty.");
        }
    }

    public void printResult(int result) {
        System.out.println("\nResult = " + result);
    }

}
