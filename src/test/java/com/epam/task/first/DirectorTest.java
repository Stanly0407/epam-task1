package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayCreator;
import com.epam.task.first.parsing.ArrayValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;


public class DirectorTest {

    private final static String TEST_DATA = "./src/test/resources/input.txt";

    @Test
    public void shouldMakeValidArraysFromFileData() throws DataException {  // RENAME!!!!!!!

        DataReader dataReader = Mockito.mock(DataReader.class);
        when(dataReader.readData(anyString())).thenReturn(Collections.singletonList(TEST_DATA));

        ArrayValidator arrayValidator = Mockito.mock(ArrayValidator.class);
        when(arrayValidator.validateLineContent(anyString())).thenReturn(true);
        when(arrayValidator.validateIfNotEmpty(anyString())).thenReturn(true);

        Array array = new Array(1, 2, 2, 2);

        List<Array> expectedArrays = new ArrayList<>();
        expectedArrays.add(array);

        ArrayCreator arrayCreator = Mockito.mock(ArrayCreator.class);
        when(arrayCreator.createArrayFromLine(anyString())).thenReturn(array);

        Director director = new Director(dataReader, arrayValidator, arrayCreator);

        List<Array> actualArrays = new ArrayList<>(director.makeValidArraysFromFile(TEST_DATA));

        Assert.assertEquals(expectedArrays, actualArrays);
    }

}
