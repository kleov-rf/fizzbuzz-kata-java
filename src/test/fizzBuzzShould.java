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
    @Test
    void return_2_when_given_2 () {
        FizzBuzz fizzbuzz = new FizzBuzz();

        String expectedResult = "2";
        String fizzbuzzResult = fizzbuzz.numberToFizzBuzz(2);

        assertEquals(expectedResult, fizzbuzzResult);
    }
}
