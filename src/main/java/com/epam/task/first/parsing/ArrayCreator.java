package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;


public class ArrayCreator {

    public Array createArrayFromLine(String data) throws NumberInLineException {
        List<Integer> elements = new ArrayList<>();
        String[] arrayFromLine = data.split("[\\s]");
        try {
            for (String stringElement : arrayFromLine) {
                elements.add(Integer.valueOf(stringElement));
            }
        } catch (NumberFormatException e) {
            throw new NumberInLineException("regex in class ArrayValidator isn't fully correct", e);
        }
        return new Array(elements);
    }
}
