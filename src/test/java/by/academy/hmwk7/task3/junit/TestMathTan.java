package by.academy.hmwk7.task3.junit;

import org.junit.*;

public class TestMathTan extends Assert {

    @Test
    public void test() {
        Math.tan(1);
    }

    @Ignore
    @Test
    public void test1() {
        fail();
    }

    @Test
    public void test2() {
        assertEquals(1, Math.tan(Math.PI / 4), 0.000001);
    }
}
