package Aston.Lesson_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test
    void number2() {
        Factorial factorial = new Factorial();
        int actual = factorial.number(2);
        int expected = 2;
        assertEquals(expected,actual);
    }

    void number5() {
        Factorial factorial = new Factorial();
        int actual = factorial.number(2);
        int expected = 120;
        assertEquals(expected,actual);
    }

}