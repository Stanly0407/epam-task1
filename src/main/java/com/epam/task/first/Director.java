package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.data.PathException;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayCreator;
import com.epam.task.first.parsing.ArrayValidator;
import com.epam.task.first.parsing.NumberInLineException;

import java.util.ArrayList;
import java.util.List;

public class Director {

    private DataReader dataReader;
    private ArrayValidator arrayValidator;
    private ArrayCreator arrayCreator;

    public Director(DataReader dataReader, ArrayValidator arrayValidator, ArrayCreator arrayCreator) {
        this.dataReader = dataReader;
        this.arrayValidator = arrayValidator;
        this.arrayCreator = arrayCreator;
    }

    public List<Array> makeArraysFromFile(String filename) {
        List<Array> arrays = new ArrayList<>();
        try {
            List<String> lines = new ArrayList<>(dataReader.readDataFromFile(filename));
            for (String line : lines) {
                if (arrayValidator.validateLineContent(line) && arrayValidator.validateIfNotEmpty(line)) {
                    arrays.add(arrayCreator.createArrayFromLine(line));
                }
            }
        } catch (DataException | PathException | NumberInLineException e) {
            e.getMessage();
        }
        return arrays;
    }
}
