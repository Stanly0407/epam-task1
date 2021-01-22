import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArrayReplaceToPrimeNumbers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayReplaceToPrimeNumbersTest {

    ArrayReplaceToPrimeNumbers arrayReplaceTo = new ArrayReplaceToPrimeNumbers();

    @Test
    public void shouldReplaceToPrimeNumberIfNotPrime() {
        Array array = new Array(-7, 0, 1, 2, 3, 7, 42, 137);
        Array modifiedArray = arrayReplaceTo.replaceToPrimeNumberIfNotPrime(array);

        List<Integer> elementsAfterReplacement = modifiedArray.getElements();
        List<Integer> elementsExpected = new ArrayList<Integer>();
        elementsExpected.add(2);
        elementsExpected.add(3);
        elementsExpected.add(7);
        elementsExpected.add(137);
        elementsExpected.add(2);
        elementsExpected.add(2);
        elementsExpected.add(2);
        elementsExpected.add(2);

        Assert.assertEquals(elementsExpected, elementsAfterReplacement);
    }

    @Test
    public void shouldReturnEmptyArrayIfArrayIsEmpty() {
        Array array = new Array();
        Array modifiedArray = arrayReplaceTo.replaceToPrimeNumberIfNotPrime(array);
        List<Integer> elementsAfterReplacement = modifiedArray.getElements();
        List<Integer> elementsExpected = new ArrayList<>();
        Assert.assertEquals(elementsExpected, elementsAfterReplacement);
    }

}
