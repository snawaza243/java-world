import java.util.Scanner;

public class ArrayAll {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arrayIO() {
        System.out.println("Array input output");

        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array element: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int linearSearch(int arr[], int key)

    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static void largestInArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Largest value = " + max);
        System.out.println("Minimum value = " + min);

    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            if (key < arr[mid]) {
                end = mid - 1;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void reverseArray(int arr[]) {
        int n = arr.length;
        int a = 0;
        int b = n - 1;
        int temp;

        // for (int i = 0; i < n; i++) {
        // temp = arr[a];
        // arr[a] = arr[b];
        // arr[b] = temp;
        // }

        while (a < b) {
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = arr[b];
            a++;
            b--;

        }
    }

    public static void pairsArray(int arr[]) {
        int n = arr.length;
        int nPairs = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
                nPairs++;
            }
            System.out.println();
        }
        System.out.println("Total No of pairs = " + nPairs);
    }

    public static void subArrays(int arr[]) {
        int n = arr.length;
        int nSubArray = 0;
        int vMax = Integer.MIN_VALUE;
        int vMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int start = i;

            int sum = 0;
            for (int j = i; j < n; j++) {
                int end = j;

                System.out.print("[");

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]);

                    sum += arr[k];

                    if (arr[k] > vMax) {
                        vMax = arr[k];

                    }
                    if (arr[k] < vMin) {
                        vMin = arr[k];
                    }
                }
                System.out.print("]");

            }
            System.out.print(" \t Larger Number = " + vMax);
            System.out.print(", Smaller Number = " + vMin);
            System.out.print(", Sum of array = " + sum);

            System.out.println();
        }
    }

    public static void maxSubArraySum(int arr[]) {
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;

                sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                    if (sum > max) {
                        max = sum;
                    }
                }
                // System.out.println(max);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum = " + max);
    }

    public static void maxSumSubArrayPrefix(int arr[]) {
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int start = i;

            for (int j = i; j < n; j++) {
                int end = j;
                // sum = 0;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        // printArray(arr);
        // arrayIO();

        // linearSearch(arr, 7);
        // largestInArray(arr);
        // binarySearch(arr, 0);
        // System.out.println(binarySearch(arr, 5));
        // reverseArray(arr);
        // printArray(arr);
        // pairsArray(arr);
        // subArrays(arr);
        // maxSubArraySum(arr);

        maxSumSubArrayPrefix(arr);

    }
}
