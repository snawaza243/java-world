public class ISumOfN {

    // Function to calculate sum of first n natural numbers
    public static int sumOfNNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Function to calculate time complexity of sum of n natural numbers
    public static void calculateTimeComplexity(int n) {
        long startTime = System.nanoTime();

        // Call function to calculate sum
        sumOfNNumbers(n);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(
                "Time complexity for sum of n natural numbers: O(n), Time taken: " + duration + " nanoseconds");
    }

    // Function to calculate space complexity of sum of n natural numbers
    public static void calculateSpaceComplexity() {
        // Additional space used is constant, O(1)
        System.out.println("Space complexity for sum of n natural numbers: O(1)");
    }

    public static void main(String[] args) {
        int n = 5; // Sum of first 5 natural numbers

        // Calculate time complexity
        calculateTimeComplexity(n);

        // Calculate sum of first n natural numbers
        int sum = sumOfNNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        // Calculate space complexity
        calculateSpaceComplexity();
    }
}