package com.epam.task.first.parsing;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    private ArrayValidator arrayValidator = new ArrayValidator();

    @Test
    public void validateLineShouldReturnTrueIfCorrectLine() {
        String testedLine = "1 9 6589 -89";
        boolean methodResult = arrayValidator.validateLineContent(testedLine);
        Assert.assertTrue(methodResult);
    }

    @Test
    public void validateLineShouldReturnFalseIfIncorrectLine() {
        String testedLine = "p8 kk 88 -7";
        boolean methodResult = arrayValidator.validateLineContent(testedLine);
        Assert.assertFalse(methodResult);
    }

    @Test
    public void validateIfNotEmptyShouldReturnTrueIfNotEmptyArray() {
        String testedLine = "p8 kk 88 -7";
        boolean methodResult = arrayValidator.validateIfNotEmpty(testedLine);
        Assert.assertTrue(methodResult);
    }

    @Test
    public void validateIfNotEmptyShouldReturnFalseIfEmptyArray() {
        String testedLine = "";
        boolean methodResult = arrayValidator.validateIfNotEmpty(testedLine);
        Assert.assertFalse(methodResult);
    }

}
