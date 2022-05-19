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

        if (number < 0) {
            System.out.println("Invalid number, can't solve.");
            return -1;
        }
        else if (number == 1)   {
            return 1;
        }
        else if (number == 0) {
            return 0;
        }
        else {
            return (number-1 + number-2);
        }
    }
}
