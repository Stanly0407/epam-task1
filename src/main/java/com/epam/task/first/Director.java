package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayCreator;
import com.epam.task.first.parsing.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class Director {
    //final String FILE_NAME = "D://EPAM-training//inputTask2.txt";

    private DataReader dataReader;
    private ArrayValidator arrayValidator;
    private ArrayCreator arrayCreator;

    public Director(DataReader dataReader, ArrayValidator arrayValidator, ArrayCreator arrayCreator) {
        this.dataReader = dataReader;
        this.arrayValidator = arrayValidator;
        this.arrayCreator = arrayCreator;
    }

    public Director() {

    }

    public List<Array> makeValidArraysFromFile(String filename)
            throws DataException { // обработать !!!!!!!!1
        List<Array> arrays = new ArrayList<>();
        List<String> lines = new ArrayList<>(dataReader.readData(filename));
        for (String line : lines) {
            if (arrayValidator.validateLineContent(line) && arrayValidator.validateIfNotEmpty(line)) {
                arrays.add(arrayCreator.createArrayFromLine(line));
            }
        }
        return arrays;
    }

}
