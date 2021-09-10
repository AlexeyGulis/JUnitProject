package by.academy.hmwk7.task3.listner;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

@RunWith(RunnerListener.class)
public class CalcFuncTestA extends Assert {
    @Rule
    public final TestRule time = Timeout.millis(20);

    @Test
    public void test1(){
        assertEquals(1,1);
    }
    @Test(expected = ArithmeticException.class)
    public void test2(){
        int c = 20/0;
    }
    @Test
    public void test3(){
        assertTrue(2==2);
    }
}
