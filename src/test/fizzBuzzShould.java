package test;

import main.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fizzBuzzShould {

    @Test
    void return_1_when_given_1 () {
        FizzBuzz fizzbuzz = new FizzBuzz();

        String expectedResult = "1";
        String fizzbuzzResult = fizzbuzz.numberToFizzBuzz(1);

        assertEquals(expectedResult, fizzbuzzResult);
    }
}
