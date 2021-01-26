package com.epam.task.first.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> readDataFromFile(String filename) throws DataException, PathException {
        List<String> lines = new ArrayList<>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new PathException("file at the specified path doesn't exist", e);
        } catch (IOException e) {
            throw new DataException("file read error", e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new DataException("close failed", e);
                }
            }
        }
        return lines;
    }
}







