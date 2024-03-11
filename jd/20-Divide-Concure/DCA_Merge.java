/**
 * DCA_Merge
 * 
 * tc = n(logn)
 * 
 * three steps to follow
 * 
 * a. divide prob into left and right part and retrieve mid index
 * b. merge sort left, right
 * c. merge left+right in temp array
 * 
 */
public class DCA_Merge {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // left iterator
        int j = mid + 1; // right iterator
        int k = 0; // temp array iterator

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
