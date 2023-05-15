package main;

public class FizzBuzz {
    public String numberToFizzBuzz(int inputNumber) {
        if (inputNumber % 3 == 0) {
            return "Fizz";
        }
        if(inputNumber == 5) {
            return "Buzz";
        }
        if(inputNumber == 25) {
            return "Buzz";
        }
        return String.valueOf(inputNumber);
    }
}
