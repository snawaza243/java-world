public class DBigOmegaLinearSearch {
    // Function to perform linear search
    public static boolean linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true; // Target found
            }
        }
        return false; // Target not found
    }

    // Function to calculate the lower bound of time complexity (Big Omega)
    public static void calculateLowerBoundTimeComplexity(int[] array, int target) {
        long startTime = System.nanoTime();

        // Call linear search function
        boolean found = linearSearch(array, target);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time complexity lower bound (Big Omega) for linear search: Ω(1), Time taken: " + duration
                + " nanoseconds");
        System.out.println("Target found: " + found);
    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 2, 9, 1 }; // Sample array
        int target = 8; // Element to search

        // Calculate lower bound of time complexity
        calculateLowerBoundTimeComplexity(array, target);
    }
}
