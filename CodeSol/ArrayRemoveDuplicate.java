public class ArrayRemoveDuplicate {

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return n;
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // for (int i = 0; i < j; i++) {
        // System.out.println(arr[i] + " ");
        // }

        return j + 1;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5, 6 };
        System.out.println(arr.length);

        // int r = removeDuplicates(arr);
        // printArray(arr, r);

    }
}
