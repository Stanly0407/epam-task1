package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArrayReplaceToPrimeNumbers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Task 1
public class ArrayReplaceToPrimeNumbersTest {

    ArrayReplaceToPrimeNumbers arrayReplaceTo = new ArrayReplaceToPrimeNumbers();

    @Test
    public void shouldReplaceToPrimeNumberIfNotPrime() {
        Array array = new Array(-7, 0, 1, 2, 3, 7, 42, 137);
        Array modifiedArray = arrayReplaceTo.replaceToPrimeNumberIfNotPrime(array);

        List<Integer> elementsAfterReplacement = modifiedArray.getElements();
        List<Integer> elementsExpected = new ArrayList<>(Arrays.asList(2, 3, 7, 137, 2, 2, 2, 2));
        Assert.assertEquals(elementsExpected, elementsAfterReplacement);
    }

    @Test
    public void shouldReturnEmptyArrayIfArrayIsEmpty() {
        Array array = new Array();
        Array modifiedArray = arrayReplaceTo.replaceToPrimeNumberIfNotPrime(array);
        List<Integer> elementsAfterReplacement = modifiedArray.getElements();
        List<Integer> elementsExpected = new ArrayList<>();
        Assert.assertEquals(elementsExpected, elementsAfterReplacement);
    }

}
