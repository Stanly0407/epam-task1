package com.epam.task.first.parsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {

    public boolean validateLineContent(String line) {

        Pattern linePattern = Pattern.compile("^([\\d -]\\s*)+$");
        Matcher matcher = linePattern.matcher(line);
        return matcher.matches();
    }

    public boolean  validateIfNotEmpty(String line){
        return !line.isEmpty();
    }

}


