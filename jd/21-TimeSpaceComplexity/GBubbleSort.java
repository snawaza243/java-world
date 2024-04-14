public class GBubbleSort {

        // Function to perform bubble sort
        public static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (array[j] > array[j+1]) {
                        // Swap array[j] and array[j+1]
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    
        // Function to print array elements
        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    
        // Function to calculate time complexity of bubble sort
        public static void calculateTimeComplexity(int[] array) {
            long startTime = System.nanoTime();
    
            // Call bubble sort function
            bubbleSort(array);
    
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
    
            System.out.println("Time complexity for bubble sort: O(n^2), Time taken: " + duration + " nanoseconds");
        }
    
        // Function to calculate space complexity of bubble sort
        public static void calculateSpaceComplexity() {
            // Bubble sort uses only a constant amount of additional space, O(1)
            System.out.println("Space complexity for bubble sort: O(1)");
        }
    
        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90}; // Sample array
    
            // Print unsorted array
            System.out.println("Unsorted array:");
            printArray(array);
    
            // Calculate time complexity
            calculateTimeComplexity(array);
    
            // Call bubble sort
            bubbleSort(array);
    
            // Print sorted array
            System.out.println("Sorted array:");
            printArray(array);
    
            // Calculate space complexity
            calculateSpaceComplexity();
        }
    }
    