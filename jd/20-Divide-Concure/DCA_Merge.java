/**
 * DCA_Merge
 * 
 * tc = n(logn)
 * 
 * three steps to follow
 * 
 * a. divide prob into left and right part and retrieve mid index
 * b. merge sort left, right
 * c. merge left+right in temp array and temp to org
 * 
 */
public class DCA_Merge {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // for left side
        mergeSort(arr, mid + 1, ei); // for right side
        merge(arr, si, mid, ei); // merge left right
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // left iterator
        int j = mid + 1; // right iterator
        int k = 0; // temp array iterator

        // compare and copy elements
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // leftover  in the left side
        while (i <= mid) {
            temp[k++] = arr[i++];

        }

        // leftover  in right part is sorted already.
        while (j <= ei) {
            temp[k++] = arr[j++];
        }


        // copy temp to org arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 3,7,4,2,6,4,62,8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
