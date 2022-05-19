public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int i = 0;
        int n = 14;
        int xn = 0;
        boolean jackpot = false;

        if (n > 0) {
            while(jackpot == false) {
                xn = fib.getFibonacci(i);
                String numberString = Integer.toString(xn);
                System.out.println("Number of digits so far: " + numberString.length());
                
                // Now for the juice - when the length of xn os 1000 digits, print the answer
                if (numberString.length() == 1000) {
                    System.out.println("Jackpot! You have reached the 1000-digit term!");
                    System.out.println("The fibonacci value of term " + i + " is " + numberString);
                    jackpot = true;
                }
                i++;
            }
        }
        else {
            System.out.println("Only positive integers allowed.");
        } 
    }
}
