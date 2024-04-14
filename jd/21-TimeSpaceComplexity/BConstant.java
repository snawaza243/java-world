public class BConstant {

    // Function to perform a constant time operation
    public static void constantTimeOperation() {
        // This operation takes constant time regardless of the input size
        System.out.println("This is a constant time operation.");
    }

    // Function to calculate time complexity (O(1))
    public static void calculateTimeComplexity() {
        long startTime = System.nanoTime();

        // Call the function to perform constant time operation
        constantTimeOperation();

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time complexity: O(1), Time taken: " + duration + " nanoseconds");
    }

    // Function to calculate space complexity (O(1))
    public static void calculateSpaceComplexity() {
        // Since the operation doesn't depend on input size, space complexity is
        // constant
        System.out.println("Space complexity: O(1)");
    }

    public static void main(String[] args) {
        // Calculate time complexity
        calculateTimeComplexity();

        // Calculate space complexity
        calculateSpaceComplexity();
    }
}
