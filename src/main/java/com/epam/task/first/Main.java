package com.epam.task.first;

import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.parsing.ArrayCreator;
import com.epam.task.first.parsing.ArrayValidator;

import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final String FILE_NAME = "D://EPAM-training//inputTask2.txt";

    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        ArrayValidator arrayValidator = new ArrayValidator();
        ArrayCreator arrayCreator = new ArrayCreator();

        Director director = new Director(dataReader, arrayValidator, arrayCreator);
        List<Array> arraysFromFile = new ArrayList<>(director.makeArraysFromFile(FILE_NAME));
        for (Array array : arraysFromFile) {
            System.out.println(array);
        }
    }
}




