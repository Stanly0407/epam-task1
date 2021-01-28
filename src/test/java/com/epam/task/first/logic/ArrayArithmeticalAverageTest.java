package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArrayArithmeticalAverage;
import org.junit.Assert;
import org.junit.Test;

// Task 1
public class ArrayArithmeticalAverageTest {
    ArrayArithmeticalAverage arrayArithmeticalAverage = new ArrayArithmeticalAverage();

    @Test
    public void arithmAverageOfElementsShouldBeCorrectIfArrayIsNotEmpty() {
        Array array = new Array(-1, 3, 0, 92, 6);
        int arithmAverage = arrayArithmeticalAverage.arithmAverageOfElements(array);
        Assert.assertEquals(20, arithmAverage);
    }

    @Test(expected = ArithmeticException.class)
    public void arithmAverageOfElementsShouldTrowsExceptionIfArrayIsEmpty()
            throws ArithmeticException {
        Array array = new Array();
        int arithmAverage = arrayArithmeticalAverage.arithmAverageOfElements(array);
    }

}
