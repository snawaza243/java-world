public class CBigOLinearSearch {

    // Function to perform linear search
    public static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true; // Target found
            }
        }
        return false; // Target not found
    }

    // Function to calculate time complexity of linear search
    public static void calculateTimeComplexity(int[] array, int target) {
        long startTime = System.nanoTime();

        // Call linear search function
        boolean found = linearSearch(array, target);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time complexity for linear search: O(n), Time taken: " + duration + " nanoseconds");
        System.out.println("Target found: " + found);
    }

    // Function to calculate space complexity of linear search
    public static void calculateSpaceComplexity(int[] array, int target) {
        // Additional space used is constant, O(1)
        System.out.println("Space complexity for linear search: O(1)");
    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 2, 9, 1 }; // Sample array
        int target = 8; // Element to search

        // Calculate time complexity
        calculateTimeComplexity(array, target);

        // Calculate space complexity
        calculateSpaceComplexity(array, target);
    }
}
