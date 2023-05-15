package test.com.academy.fizzbuzzKata;

public class fizzBuzzShould {

    @Test
    void return_1_when_given_1 () {
        FizzBuzz fizzbuzz = new FizzBuzz();

        String expectedResult = "1";
        String fizzbuzzResult = fizzbuzz.numberToFizzBuzz(1);

        assertEquals(fizzbuzzResult, expectedResult);
    }
}
