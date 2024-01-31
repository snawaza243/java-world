public class ReverseArray {

    public static void reverseArr(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 23, 65, 98 };

        reverseArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
