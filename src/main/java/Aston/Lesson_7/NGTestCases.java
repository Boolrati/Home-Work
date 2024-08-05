package Aston.Lesson_7;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NGTestCases {

    @Test
    void number2() {
        Factorial factorial = new Factorial();
        int actual = factorial.number(2);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void number5() {
        Factorial factorial = new Factorial();
        int actual = factorial.number(5);
        int expected = 120;
        assertEquals(expected, actual);
    }

    @Test()
    void number0() {
        Factorial factorial = new Factorial();
        int actual = factorial.number(0);
        int expected = 1;
        assertEquals(expected, actual);
    }


}
