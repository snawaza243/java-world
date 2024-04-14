public class FLoopTHree {

    // Function with three nested loops
    public static void threeNestedLoops(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }
    }

    // Function to calculate time complexity of three nested loops
    public static void calculateTimeComplexity(int n) {
        long startTime = System.nanoTime();

        // Call function with three nested loops
        threeNestedLoops(n);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time complexity for three nested loops: O(n^3), Time taken: " + duration + " nanoseconds");
    }

    // Function to calculate space complexity of three nested loops
    public static void calculateSpaceComplexity(int n) {
        // Additional space used is constant, O(1)
        System.out.println("Space complexity for three nested loops: O(1)");
    }

    public static void main(String[] args) {
        int n = 3; // Adjust the value of n as needed

        // Calculate time complexity
        calculateTimeComplexity(n);

        // Calculate space complexity
        calculateSpaceComplexity(n);
    }
}
