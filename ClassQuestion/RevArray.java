public class RevArray {
    static void ReverseArray(int arr[]) {
        int size = arr.length;
        int[] arr2 = new int[size];
        int i, j;
        j = size;
        for (i = 0; i < arr.length; i++) {
            arr2[j - 1] = arr[i];
            j = j - 1;
        }
        for (int k = 0; k < size; k++) {

            System.out.print(" " + arr2[k]);
        }
    }

    public static void main(String[] args) {
        int ar[] = { 2, 3, 4, 5 };
        // ReverseArray(ar);

        int[] arr2 = new int[ar.length];
        System.out.println(arr2);
    }
}
