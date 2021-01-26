package com.epam.task.first.logic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayBubbleSortTest {
    ArrayBubbleSort arrayBubbleSort = new ArrayBubbleSort();

    @Test
    public void shouldSortArrayByBubbleSort() {
        List<Integer> testedArray = new ArrayList<>();
        testedArray.add(0);
        testedArray.add(20);
        testedArray.add(-90);
        testedArray.add(42);
        List<Integer> expectedArray = new ArrayList<>();
        expectedArray.add(-90);
        expectedArray.add(0);
        expectedArray.add(20);
        expectedArray.add(42);
        arrayBubbleSort.sortArrayByBubbleSort(testedArray);

        Assert.assertEquals(expectedArray, testedArray);

    }

}
