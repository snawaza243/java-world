
public class AForLoop {

    // Function to print simple text using a for loop
    public static void printSimpleText(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("This is a simple text.");
        }
    }

    // Function to calculate time complexity
    public static void calculateTimeComplexity(int n) {
        long startTime = System.nanoTime();

        // Call the function to print simple text
        printSimpleText(n);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time complexity for n = " + n + ": " + duration + " nanoseconds");
    }

    // Function to calculate space complexity
    public static void calculateSpaceComplexity(int n) {
        // Assuming the space complexity is O(1) since we're not using any additional
        // space in this program
        System.out.println("Space complexity for n = " + n + ": O(1)");
    }

    public static void main(String[] args) {
        int n = 10; // Adjust the value of n as needed

        // Calculate time complexity
        calculateTimeComplexity(n);

        // Calculate space complexity
        calculateSpaceComplexity(n);
    }

}