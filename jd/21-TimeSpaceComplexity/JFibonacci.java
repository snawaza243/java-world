public class JFibonacci {

    // Function to calculate the Fibonacci sequence up to the nth term
    public static int[] fibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Function to calculate time complexity of Fibonacci sequence
    public static void calculateTimeComplexity(int n) {
        long startTime = System.nanoTime();

        // Call function to calculate Fibonacci sequence
        fibonacci(n);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time complexity for Fibonacci sequence: O(n), Time taken: " + duration + " nanoseconds");
    }

    // Function to calculate space complexity of Fibonacci sequence
    public static void calculateSpaceComplexity() {
        // Additional space used is O(n) for storing the Fibonacci sequence
        System.out.println("Space complexity for Fibonacci sequence: O(n)");
    }

    public static void main(String[] args) {
        int n = 10; // Calculate Fibonacci sequence up to the 10th term

        // Calculate time complexity
        calculateTimeComplexity(n);

        // Calculate Fibonacci sequence
        int[] fibSequence = fibonacci(n);
        System.out.println("Fibonacci sequence up to the " + n + "th term:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibSequence[i] + " ");
        }

        // Calculate space complexity
        calculateSpaceComplexity();
    }
}
