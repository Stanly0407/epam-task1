package com.epam.task.first.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {

    public boolean validateLineContent(String line) {
        String onlyDigitsAndSpaces = "^([\\d -]\\s*)+$";
        Pattern linePattern = Pattern.compile(onlyDigitsAndSpaces);
        Matcher matcher = linePattern.matcher(line);
        return matcher.matches();
    }

    public boolean validateIfNotEmpty(String line) {
        return !line.isEmpty();
    }

}


