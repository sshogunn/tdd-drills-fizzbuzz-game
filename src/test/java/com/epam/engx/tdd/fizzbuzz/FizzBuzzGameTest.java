package com.epam.engx.tdd.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Nurmakanov
 */
public class FizzBuzzGameTest {
    private FizzBuzzGame game = new FizzBuzzGame();

    @Test
    public void shouldPrintOneWhenOneIsPassed() {
        //GIVEN
        int number = 1;
        //WHEN
        String answer = game.evaluate(number);
        //THEN
        assertThat(answer, is(String.valueOf(number)));
    }

    @Test
    public void shouldPrintTwoWhenTwoIsPassed() {
        //GIVEN
        int number = 2;
        //WHEN
        String answer = game.evaluate(number);
        //THEN
        assertThat(answer, is(String.valueOf(number)));
    }

    @Test
    public void shouldPrintFizzWhenThreeIsPassed() {
        //GIVEN
        int number = 3;
        //WHEN
        String answer = game.evaluate(number);
        //THEN
        assertThat(answer, is("FIZZ"));
    }

    @Test
    public void shouldPrintBuzzWhenFiveIsPassed() {
        //GIVEN
        int number = 5;
        //WHEN
        String answer = game.evaluate(number);
        //THEN
        assertThat(answer, is("BUZZ"));
    }

    @Test
    public void shouldPrintFizzWhenSixIsPassed() {
        //GIVEN
        int number = 6;
        //WHEN
        String answer = game.evaluate(number);
        //THEN
        assertThat(answer, is("FIZZ"));
    }

    @Test
    public void shouldPrintBuzzWhenTenIsPassed() {
        //GIVEN
        int number = 10;
        //WHEN
        String answer = game.evaluate(number);
        //THEN
        assertThat(answer, is("BUZZ"));
    }

    @Test
    public void shouldPrintFizzBuzzWhenFifteenIsPassed() {
        //GIVEN
        int number = 15;
        //WHEN
        String answer = game.evaluate(number);
        //THEN
        assertThat(answer, is("FIZZBUZZ"));
    }

    @Test
    public void shouldPrintFizzBuzzWhenThirtyIsPassed() {
        //GIVEN
        int number = 30;
        //WHEN
        String answer = game.evaluate(number);
        //THEN
        assertThat(answer, is("FIZZBUZZ"));
    }
}
