package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author Samorodov
 * @version $id$
 * @since 01
 */
public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(20D, 40D);
        double result = calc.getResult();
        double expected = 60D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivisionOneDivideOneThenOne() {
        Calculator calc = new Calculator();
        calc.div(10.5D, 2.5D);
        double result = calc.getResult();
        double expected = 4.2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtractOneSubtractOneThenTwZero() {
        Calculator calc = new Calculator();
        calc.subtract(11D, 5D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleOneMultipleOneThenOne() {
        Calculator calc = new Calculator();
        calc.multiple(11D, 5D);
        double result = calc.getResult();
        double expected = 55D;
        assertThat(result, is(expected));
    }



}



