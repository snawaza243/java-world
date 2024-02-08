
public class BasicSortingAlgo {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSorting(int arr[]) {

        int n = arr.length;

        for (int turn = 0; turn < n; turn++) {
            for (int index = 0; index < n - 1 - turn; index++) {
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPo = i;

            for (int j = i + 1; j < arr.length; j++) {
                // if (arr[minPo] > arr[j]) { // for increasing
                if (arr[minPo] < arr[j]) { // for decreasing

                    minPo = j;
                }
            }

            int temp = arr[minPo];
            arr[minPo] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int preview = i - 1;

            // while (preview >= 0 && arr[preview] > current) { // asending
            while (preview >= 0 && arr[preview] > current) { // decending

                arr[preview + 1] = arr[preview];
                preview--;

            }
            arr[preview + 1] = current;
        }
    }

    public static void countingSort(int arr[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            large = Math.max(large, arr[i]);
        }

        int count[] = new int[large + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] { 4, 2, 7, 1, 5 };

        // selectionSort(array);

        // insertionSort(array);
        countingSort(array);

        printArray(array);

    }
}
