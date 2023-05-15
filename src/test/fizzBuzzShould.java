package test;

import main.FizzBuzz;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fizzBuzzShould {

    private static FizzBuzz fizzbuzz;

    @BeforeAll
    static void setup_fizzbuzz(){
        fizzbuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "4, '4'"
    })
    void return_the_number_when_given_not_special_number(int input, String output){
        String fizzbuzzResult = fizzbuzz.numberToFizzBuzz(input);

        assertEquals(output, fizzbuzzResult);
    }
    @Test
    void return_Fizz_when_given_three(){
        String fizzbuzzResult = fizzbuzz.numberToFizzBuzz(3);
        String expectedResult = "Fizz";

        assertEquals(expectedResult, fizzbuzzResult);
    }

}
