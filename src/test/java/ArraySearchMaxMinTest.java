import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArraySearchMaxMin;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ArraySearchMaxMinTest {

    private ArraySearchMaxMin arraySearchMaxMin = new ArraySearchMaxMin();

    @Test
    public void findMaxShouldFindMaxWhenPositiveNumbersApplied() {
        Array array = new Array(11, 3, 65, 2);
        int maxElement = arraySearchMaxMin.findMax(array);
        Assert.assertEquals(65, maxElement);
    }

    @Test
    public void findMaxShouldFindMaxWhenNegativeNumbersApplied() {
        Array array = new Array(-1, -3, -5, -92);
        int maxElement = arraySearchMaxMin.findMax(array);
        Assert.assertEquals(-1, maxElement);
    }

    @Test
    public void findMaxShouldFindMaxWhenDifferentNumbersApplied() {
        Array array = new Array(-1, 0, -5, -92, 128, -1000, 42);
        int maxElement = arraySearchMaxMin.findMax(array);
        Assert.assertEquals(128, maxElement);
    }

    @Test
    public void findMinShouldFindMinWhenPositiveNumbersApplied() {
        Array array = new Array(11, 3, 65, 2);
        int minElement = arraySearchMaxMin.findMin(array);
        Assert.assertEquals(2, minElement);
    }

    @Test
    public void findMinShouldFindMinWhenNegativeNumbersApplied() {
        Array array = new Array(-1, -102, -5, -92);
        int minElement = arraySearchMaxMin.findMin(array);
        Assert.assertEquals(-102, minElement);
    }

    @Test
    public void findMinShouldFindMinWhenDifferentNumbersApplied() {
        Array array = new Array(-1, 0, -5, -92, 128, -1000, 42);
        int minElement = arraySearchMaxMin.findMin(array);
        Assert.assertEquals(-1000, minElement);
    }

    @Test
    public void sortArrayShouldSortCorrectly() {
        Array array = new Array(0, -10, 128, 42);
        List<Integer> elementsExpected = new ArrayList<>();
        elementsExpected.add(-10);
        elementsExpected.add(0);
        elementsExpected.add(42);
        elementsExpected.add(128);
        List<Integer> elements = array.getElements();
        arraySearchMaxMin.sortArray(elements);
        Assert.assertEquals(elementsExpected, elements);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void findMaxShouldTrowExceptionIfArrayIsEmpty()
            throws IndexOutOfBoundsException {
        Array array = new Array();
        int maxElement = arraySearchMaxMin.findMax(array);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void findMinShouldTrowExceptionIfArrayIsEmpty()
            throws IndexOutOfBoundsException {
        Array array = new Array();
        int minElement = arraySearchMaxMin.findMin(array);
    }

}
