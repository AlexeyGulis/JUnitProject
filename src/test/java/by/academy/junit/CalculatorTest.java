package by.academy.junit;

import org.junit.*;

public class CalculatorTest extends Assert {
    @BeforeClass
    public static void mess(){
        System.out.println("Начинаем выполнять тесты");
    }
    @Before
    public void messJUnit1(){
        System.out.println("Начинаем выполнять тесты JUnit");
    }
    @Test(timeout = 10_000)
    public void test1(){
        int i = 2;
        for (int j = 0; j < 10_000_000_0; j++) {
            i+=Calculator.getSum(i,2);
        }
    }
    @After
    public void messJUnit1Ex(){
        System.out.println("Закончили выполнять тесты JUnit");
    }
    @Before
    public void messJUnit2(){
        System.out.println("Начинаем выполнять тесты JUnit");
    }
    @Test
    public void test2(){
        int x = 1;
        int y = 2;
        Calculator.getMultiple(x,y);
    }
    @After
    public void messJUnit2Ex(){
        System.out.println("Закончили выполнять тесты JUnit");
    }
    @Before
    public void messJUnit3(){
        System.out.println("Начинаем выполнять тесты JUnit");
    }
    @Test(expected = ArithmeticException.class)
    public void test3(){
        int x = 10;
        int y = 0;
        Calculator.getDivide(x,y);
    }
    @After
    public void messJUnit3Ex(){
        System.out.println("Закончили выполнять тесты JUnit");
    }
    @Before
    public void messJUnit4(){
        System.out.println("Начинаем выполнять тесты JUnit");
    }
    @Ignore
    @Test
    public void test4(){
        fail();
    }
    @After
    public void messJUnit4Ex(){
        System.out.println("Закончили выполнять тесты JUnit");
    }
    @AfterClass
    public static void messExit(){
        System.out.println("Закончили выполнять тесты");
    }
}
