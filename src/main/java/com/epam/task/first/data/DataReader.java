package com.epam.task.first.data;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


// логика чтения строк из файла
//FileInputStream / FileReader java.io
// нельзя использовать классы типа File.readLines()

public class DataReader {

    public List<String> readData(String filename) throws DataException {
        List<String> lines = new ArrayList<>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(filename), Charset.forName("UTF-8")));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            // log error
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // log warning
                }
            }

        }

        return lines;
    }


}







