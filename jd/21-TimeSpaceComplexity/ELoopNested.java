public class ELoopNested {

    // Function with nested loops
    public static void nestedLoop(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }

    // Function to calculate time complexity of nested loop
    public static void calculateTimeComplexity(int n) {
        long startTime = System.nanoTime();

        // Call nested loop function
        nestedLoop(n);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time complexity for nested loop: O(n^2), Time taken: " + duration + " nanoseconds");
    }

    // Function to calculate space complexity of nested loop
    public static void calculateSpaceComplexity(int n) {
        // Additional space used is constant, O(1)
        System.out.println("Space complexity for nested loop: O(1)");
    }

    public static void main(String[] args) {
        int n = 3; // Adjust the value of n as needed

        // Calculate time complexity
        calculateTimeComplexity(n);

        // Calculate space complexity
        calculateSpaceComplexity(n);
    }
}
