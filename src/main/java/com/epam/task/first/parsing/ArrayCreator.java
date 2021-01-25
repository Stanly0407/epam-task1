package com.epam.task.first.parsing;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;


public class ArrayCreator {

    public Array createArrayFromLine(String data) {
        List<Integer> elements = new ArrayList<>();
        String[] arrayFromLine = data.split("[\\s]");
        for (String stringElement : arrayFromLine) {
            elements.add(Integer.valueOf(stringElement));
        }
        return new Array(elements);
    }
}
