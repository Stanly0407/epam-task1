package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    private final static String TEST_DATA = "./src/test/resources/input.txt";
    DataReader dataReader = new DataReader();

    @Test
    public void readDataTestShouldReturnStringsListFromLines () throws DataException, PathException {
        List<String> lines = new ArrayList<>(dataReader.readDataFromFile(TEST_DATA));
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("8 9 3 8");
        expectedLines.add("p9 lpt6");
        expectedLines.add("");
        expectedLines.add("-548 69 1 6 0");

        Assert.assertEquals(expectedLines, lines);
    }

    @Test (expected = PathException.class)
    public void readDataTestShouldTrowsPathException() throws DataException, PathException {
        final String WRONG_PATH = "./src/input.txt";
        List<String> lines = new ArrayList<>(dataReader.readDataFromFile(WRONG_PATH));
    }
}
