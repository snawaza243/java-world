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


    public static void main(String[] args) {

        int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
        // printArray(arr);
        // arrayIO();

        // linearSearch(arr, 7);
        // largestInArray(arr);
        // binarySearch(arr, 0);
        // System.out.println(binarySearch(arr, 5));

    }
}
