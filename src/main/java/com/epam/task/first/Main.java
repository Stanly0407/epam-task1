package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArrayReplaceToPrimeNumbers;
import com.epam.task.first.logic.ArraySumElements;
import com.epam.task.first.parsing.ArrayCreator;
import com.epam.task.first.parsing.ArrayValidator;
import com.epam.task.first.view.ArrayPrinter;
import com.epam.task.first.view.ConsoleArrayPrinter;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Task 1
public class Main {

    public static void main(String[] args)
            throws DataException //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
    {

        final String FILE_NAME = "D://EPAM-training//inputTask2.txt";

         DataReader dataReader = new DataReader();
         List<String> linesTest = new ArrayList<>(dataReader.readData(FILE_NAME));
        for (String line : linesTest){
            System.out.println("*** " + line);
        }

        ArrayValidator arrayValidator = new ArrayValidator();
        for (String line : linesTest){
            boolean isValidateLine = arrayValidator.validateLineContent(line);
            System.out.println("--- " + isValidateLine);
        }

        ArrayCreator arrayCreator = new ArrayCreator();
        List<Array> arrays = new ArrayList<>();
        for (String line : linesTest) {
            if (arrayValidator.validateLineContent(line) && arrayValidator.validateIfNotEmpty(line)) {
                arrays.add(arrayCreator.createArrayFromLine(line));
            }
        }

        for (Array array: arrays){
            System.out.println(array);
        }

        Director director = new Director(dataReader, arrayValidator, arrayCreator);
        List<Array> arraysFromFile = new ArrayList<>(director.makeValidArraysFromFile(FILE_NAME));
        for (Array array : arraysFromFile){
            System.out.println("ARRAY___" + array);
        }

        System.out.println("__________________________________");


//        ArraySumElements arraySumElements = new ArraySumElements();
//        ArrayReplaceToPrimeNumbers arrayChangePrimeNumbers = new ArrayReplaceToPrimeNumbers();
//        ArrayPrinter arrayPrinter = new ConsoleArrayPrinter();
//
//        Array array = new Array(-7, 0, 2, 3, 5, -42, 7, 103, -137);
//        Array modifiedArray = arrayChangePrimeNumbers.replaceToPrimeNumberIfNotPrime(array);
//        arrayPrinter.printArray(modifiedArray);
//
//        int sumElements = arraySumElements.sumArrayElements(modifiedArray);
//        arrayPrinter.printResult(sumElements);
//
//        System.out.println("-----------------------");
//        try(FileReader reader = new FileReader("D://EPAM-training//inputTask2.txt"))
//        {
//            // читаем посимвольно
//            int c;
//            while((c=reader.read())!=-1){
//
//                String str = "";
//                List<String> lines = new ArrayList<>();
//
//                while(((char)c != '\n') || ((char)c != '\r')){
//                    String line = str.concat(String.valueOf((char)c));
//                    System.out.println(line);
//                    lines.add(str);
//
//                }
//
//
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
//
//        try {
//
//            File f = new File("D://EPAM-training//inputTask2.txt");
//
//            BufferedReader b = new BufferedReader(new FileReader(f));
//
//            String readLine = "";
//
//            System.out.println("Reading file using Buffered Reader");
//
//            while ((readLine = b.readLine()) != null) {
//                System.out.println("***");
//                System.out.println(readLine);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    }




