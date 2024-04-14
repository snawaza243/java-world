public class KMergSort {

    // Function to perform merge sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point to divide the array into two halves
            int mid = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Function to merge two subarrays of array[]
    private static void merge(int[] array, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays back into array[l..r]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of L[], if any
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy the remaining elements of R[], if any
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Function to calculate time complexity of merge sort
    public static void calculateTimeComplexity(int[] array) {
        long startTime = System.nanoTime();

        // Call merge sort function
        mergeSort(array, 0, array.length - 1);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time complexity for merge sort: O(n log n), Time taken: " + duration + " nanoseconds");
    }

    // Function to calculate space complexity of merge sort
    public static void calculateSpaceComplexity() {
        // Merge sort uses additional space proportional to the input size, O(n)
        System.out.println("Space complexity for merge sort: O(n)");
    }

    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6, 7 }; // Sample array

        // Calculate time complexity
        calculateTimeComplexity(array);

        // Call merge sort
        mergeSort(array, 0, array.length - 1);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Calculate space complexity
        calculateSpaceComplexity();
    }
}
