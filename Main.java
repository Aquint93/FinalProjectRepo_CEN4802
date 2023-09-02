package cen4802;
/**
 * This class contains a program to calculat the nth term of the Fibonacci sequence
 */
public class Main {
    /**
     * The main method calculates and prints the nth term of the Fibbonacci sequence
     * @param args Command-line arguments not used in this program
     */
    public static void main(String[] args) {
        int n = 10;// Change this value to determine another Fibonacci sequence
        int answer = 0;
        answer = fibonacci(n);
        System.out.println("The "+n+"th term of the Fibonacci sequence is "+answer);
    }
    /**
     * This methd calculates the nth term of the Fibonacci sequence recursively.
     * @param n The position of term to be calculated
     * @return The nth term of the Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}