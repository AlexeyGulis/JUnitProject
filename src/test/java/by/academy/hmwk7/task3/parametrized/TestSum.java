package by.academy.hmwk7.task3.parametrized;

import by.academy.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TestSum extends Assert {
    private int inputValue1;
    private int inputValue2;
    private int result;

    public TestSum(int inputValue1, int inputValue2, int result) {
        this.inputValue1 = inputValue1;
        this.inputValue2 = inputValue2;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}:getSum({0}/{1})={3}")
    public static Iterable<Object[]> dataForSum() {
        return Arrays.asList(
                new Object[][]{{1, 2, 3}, {1, 1, 2}, {4, 2, 6}, {121, 11, 132}, {4, 7, 11}, {2, 6, 11}});
    }

    @Test
    public void paramTestSum() {
        assertEquals(result, Calculator.getSum(inputValue1, inputValue2));
    }

    @Test
    public void test() {
        Calculator.getSum(1, 2);
    }
}
