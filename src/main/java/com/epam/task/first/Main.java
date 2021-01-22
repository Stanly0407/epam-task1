package com.epam.task.first;

import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArrayReplaceToPrimeNumbers;
import com.epam.task.first.logic.ArraySumElements;
import com.epam.task.first.view.ArrayPrinter;
import com.epam.task.first.view.ConsoleArrayPrinter;


public class Main {

    public static void main(String[] args) {
        ArraySumElements arraySumElements = new ArraySumElements();
        ArrayReplaceToPrimeNumbers arrayChangePrimeNumbers = new ArrayReplaceToPrimeNumbers();
        ArrayPrinter arrayPrinter = new ConsoleArrayPrinter();

        Array array = new Array(-7, 0, 2, 3, 5, -42, 7, 103, -137);
        Array modifiedArray = arrayChangePrimeNumbers.replaceToPrimeNumberIfNotPrime(array);
        arrayPrinter.printArray(modifiedArray);

        int sumElements = arraySumElements.sumArrayElements(modifiedArray);
        arrayPrinter.printResult(sumElements);
    }
}
