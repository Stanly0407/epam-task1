import com.epam.task.first.entities.Array;
import com.epam.task.first.logic.ArraySumElements;
import org.junit.Assert;
import org.junit.Test;


public class ArraySumElementsTest {

    ArraySumElements arraySumElements = new ArraySumElements();

    @Test
    public void shouldSumArrayElementsWhenArrayIsNotEmpty() {
        Array array = new Array(-1, 3, 0, 92, 6);
        int sumElements = arraySumElements.sumArrayElements(array);
        Assert.assertEquals(100, sumElements);
    }

    @Test
    public void shouldSumArrayElementsWhenArrayIsEmpty() {
        Array array = new Array();
        int sumElements = arraySumElements.sumArrayElements(array);
        Assert.assertEquals(0, sumElements);
    }

}
