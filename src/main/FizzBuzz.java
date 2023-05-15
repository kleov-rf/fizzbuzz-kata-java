package main;

public class FizzBuzz {
    public String numberToFizzBuzz(int inputNumber) {
        if(inputNumber == 3) {
            return "Fizz";
        }
        return String.valueOf(inputNumber);
    }
}
