package main;

public class FizzBuzz {
    public String numberToFizzBuzz(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(inputNumber);
    }
}
