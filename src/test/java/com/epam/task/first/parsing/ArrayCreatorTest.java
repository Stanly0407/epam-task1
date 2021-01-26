package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCreatorTest {

    private ArrayCreator arrayCreator = new ArrayCreator();

    @Test
    public void shouldCreateArrayFromValidLine() throws NumberInLineException {
        String line = "1 -96 0 568";
        Array createdArray = arrayCreator.createArrayFromLine(line);
        Array expectedArray = new Array(1, -96, 0, 568);
        Assert.assertEquals(expectedArray, createdArray);
    }

    @Test(expected = NumberInLineException.class)
    public void createArrayFromInvalidLineShouldTrowsNumberInLineException() throws NumberInLineException {
        String line = "1u 0o 568";
        Array createdArray = arrayCreator.createArrayFromLine(line);
    }
}
