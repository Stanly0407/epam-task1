package com.epam.task.first.logic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySelectionSortTest {

    ArraySelectionSort arraySelectionSort = new ArraySelectionSort();

    @Test
    public void shouldSortArrayBySelectionSort(){
        List<Integer> testedArray = new ArrayList<>(Arrays.asList(0, 20, -90, 42));
        List<Integer> expectedArray = new ArrayList<>(Arrays.asList(-90, 0, 20, 42));
        arraySelectionSort.sortArrayBySelectionSort(testedArray);
        Assert.assertEquals(expectedArray, testedArray);
    }
}
