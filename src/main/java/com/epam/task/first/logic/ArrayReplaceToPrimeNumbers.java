package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayReplaceToPrimeNumbers {

    //if the array element is not a prime number, the method replaces such element to the number 2
    public Array replaceToPrimeNumberIfNotPrime(Array array) {
        List<Integer> elements = array.getElements();
        List<Integer> modifiedArray = new ArrayList<>(elements);
        int temporary;

        for (Integer element : elements) {
            if (element <= 1) {       // prime numbers are only positive numbers and > 1
                modifiedArray.remove(element);
                modifiedArray.add(2); // the element becomes a prime number
            }
            for (int i = 2; i <= element / 2; i++) {
                temporary = element % i;
                if (temporary == 0) {
                    modifiedArray.remove(element);
                    modifiedArray.add(2); // the element becomes a prime number
                    break;
                }
            }
        }
        return new Array(modifiedArray); // result - new array contains only prime numbers (keeping the existed prime numbers)
    }
}
