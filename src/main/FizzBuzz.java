package main;

public class FizzBuzz {
    public String numberToFizzBuzz(int inputNumber) {
        String phrase = String.valueOf(inputNumber);

        if (inputNumber % 3 == 0) {
            phrase = "Fizz";
        }
        if (inputNumber % 5 == 0) {
            phrase = "Buzz";
        }

        return phrase;
    }
}