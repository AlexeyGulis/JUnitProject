package by.academy.hmwk7.task3.parametrized;

import by.academy.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TestMultiple extends Assert {
    private int inputValue1;
    private int inputValue2;
    private int result;

    public TestMultiple(int inputValue1, int inputValue2, int result) {
        this.inputValue1 = inputValue1;
        this.inputValue2 = inputValue2;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}:getMultiple({0}/{1})={3}")
    public static Iterable<Object[]> dataForMultiple() {
        return Arrays.asList(
                new Object[][]{{1, 0, 0}, {3, 5, 15}, {4, 2, 8}, {12, 11, 132}, {13, 7, 91}, {2, 6, 20}});
    }

    @Test
    public void paramTestMultiple() {
        assertEquals(result, Calculator.getMultiple(inputValue1, inputValue2));
    }

    @Test
    public void test() {
        Calculator.getMultiple(1, 2);
    }
}
