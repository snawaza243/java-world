class SortJavaSelection {

    static void stableSelection(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                    int key = arr[min];
                    while (min > i) {
                        arr[min] = arr[min - 1];
                        min--;
                    }
                    arr[i] = key;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;

                    // swapping min_index with first element
                    int temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        // printing the sorted array
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 7, 2, 4, 5, 6, 9, 8, 2 };
        stableSelection(arr, arr.length);

    }
}

/* 14/02/20222
 * Sort: Selection sort also “Bidirectional selection sort"
 * Time: O{N2}
 * Space: O(1)
 * Working: Repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list
 * Adv: Simple, stable, for small data,not req additional mm to sort
 * Dav: Not for large, poor cache performance, high no of operation, not handle duplicate efficiently, it can be solve with quicksort and heap
 */