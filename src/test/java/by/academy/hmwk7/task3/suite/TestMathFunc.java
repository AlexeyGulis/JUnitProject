package by.academy.hmwk7.task3.suite;

import by.academy.hmwk7.task3.junit.TestMathSqrt;
import by.academy.hmwk7.task3.junit.TestMathTan;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestMathSqrt.class, TestMathTan.class})
public class TestMathFunc {
}
