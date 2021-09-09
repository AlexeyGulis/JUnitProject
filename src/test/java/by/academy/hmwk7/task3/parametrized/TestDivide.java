package by.academy.hmwk7.task3.parametrized;

import by.academy.junit.Calculator;
import by.academy.junit.CalculatorTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class TestDivide extends Assert {

    private int inputValue1;
    private int inputValue2;
    private int result;

    public TestDivide(int inputValue1, int inputValue2, int result) {
        this.inputValue1 = inputValue1;
        this.inputValue2 = inputValue2;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}:getDivide({0}/{1})={3}")
    public static Iterable<Object[]> dataForDivide() {
        return Arrays.asList(
                new Object[][]{{1, 2, 0}, {1, 1, 1}, {4, 2, 2}, {121, 11, 11}, {42, 7, 6}, {42, 6, 6}});
    }

    @Test
    public void paramTestDivide() {
        assertEquals(result, Calculator.getDivide(inputValue1, inputValue2));
    }

    @Test
    public void test() {
        Calculator.getDivide(1, 2);
    }

}
