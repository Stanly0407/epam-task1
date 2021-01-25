package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    private final static String TEST_DATA = "./src/test/resources/input.txt";
    DataReader dataReader = new DataReader();

    @Test
    public void readDataTestShouldReturnStringsListFromLines () throws DataException {
        List<String> lines = new ArrayList<>(dataReader.readData(TEST_DATA));
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("8 9 3 8");
        expectedLines.add("p9 lpt6");
        expectedLines.add("");
        expectedLines.add("-548 69 1 6 0");

        Assert.assertEquals(expectedLines, lines);

    }

}
