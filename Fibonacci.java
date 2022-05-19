/*
This is a practice solution to a problem in Project Euler

1000-digit Fibonacci number
Problem 25

*/

public class Fibonacci {

    // Reuturn a Fibonacci number
    public int getFibonacci(int number)
    {
        //int sum = 0;

        if (number <= 1) {
            return number;
        }
        else {
            // recursive call
            return (getFibonacci(number-1) + getFibonacci(number-2));
        }
    }
}
