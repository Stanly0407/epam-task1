package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArrayCountElements;
import org.junit.Assert;
import org.junit.Test;

// Task 1
public class ArrayCountElementsTest {

    ArrayCountElements arrayCountElements = new ArrayCountElements();

    @Test
    public void shouldCountQuantityPositiveElementsInNotEmptyArray() {
        Array array = new Array(-3000, 0, 21, -42, 2, 58, -63);
        int quantityPositiveElements = arrayCountElements.countPositiveElements(array);
        Assert.assertEquals(3, quantityPositiveElements);
    }

    @Test
    public void shouldCountQuantityNegativeElementsInNotEmptyArray() {
        Array array = new Array(22, 102, -21, 0);
        int quantityNegativeElements = arrayCountElements.countNegativeElements(array);
        Assert.assertEquals(1, quantityNegativeElements);
    }

    @Test
    public void shouldCountQuantityNegativeElementsIfArrayIsEmpty() {
        Array array = new Array();
        int quantityNegativeElements = arrayCountElements.countNegativeElements(array);
        Assert.assertEquals(0, quantityNegativeElements);
    }

}
