package by.academy.hmwk7.task3.junit;

import org.junit.*;

public class TestMathSqrt extends Assert {

    @Test
    public void test() {
        Math.sqrt(-5);

    }

    @Test
    public void test1() {
        assertEquals(4, Math.sqrt(16), 0.000001);
    }

    @Ignore
    @Test
    public void test2() {
        fail();
    }
}
