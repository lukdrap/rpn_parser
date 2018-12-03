package pl.rpn.calculators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AdditionSubtractionCalculatorTest {

    private AdditionSubtractionCalculator calculator = new AdditionSubtractionCalculator();

    @Test
    void calculate_positiveNumbersAddition() {
        //given
        String[] expression = "2 7 +".split(" ");
        Double expecValue = 9.0;
        //when
        Double result = calculator.calculate(expression);
        //then
        assertEquals(expecValue, result);
    }

    @Test
    void calculate_negativeNumbersAddition() {
        //given
        String[] expression = "-2 7 +".split(" ");
        Double expecValue = 5.0;
        //when
        Double result = calculator.calculate(expression);
        //then
        assertEquals(expecValue, result);
    }

    @Test
    void calculate_positiveNumbersSubtraction() {
        //given
        String[] expression = "5 2 -".split(" ");
        Double expecValue = 3.0;
        //when
        Double result = calculator.calculate(expression);
        //then
        assertEquals(expecValue, result);
    }

    @Test
    void calculate_negativeNumbersSubtraction() {
        //given
        String[] expression = "-2 7 -".split(" ");
        Double expecValue = -9.0;
        //when
        Double result = calculator.calculate(expression);
        //then
        assertEquals(expecValue, result);
    }

    @Test
    void calculate_decimalNumbers() {
        //given
        String[] expression = "5.5 7.7 +".split(" ");
        Double expecValue = 13.2;
        //when
        Double result = calculator.calculate(expression);
        //then
        assertEquals(expecValue, result);
    }

    @Test
    void calculate_additionSubtraction() {
        //given
        String[] expression = "2 7 + 3 -".split(" ");
        Double expecValue = 6.0;
        //when
        Double result = calculator.calculate(expression);
        //then
        assertEquals(expecValue, result);
    }

}