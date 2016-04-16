package com.epam.engx.tdd.fizzbuzz;

/**
 * @author Nurmakanov
 */
public class FizzBuzzGame {
    public String evaluate(int i) {
        if (canSayFizz(i) && canSayBuzz(i)) {
            return "FIZZBUZZ";
        } else if (canSayFizz(i)) {
            return "FIZZ";
        } else if (canSayBuzz(i)) {
            return "BUZZ";
        } else {
            return String.valueOf(i);
        }
    }

    private boolean canSayBuzz(int i) {
        return i % 5 == 0;
    }

    private boolean canSayFizz(int i) {
        return i % 3 == 0;
    }
}
