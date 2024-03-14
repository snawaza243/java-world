public class DCB_SortedRotated {

    public static int search(int arr[], int tar, int si, int ei) {

        // bas
        if (si > ei) {
            return -1;
        }

        // task
        int mid = si + (ei - si) / 2;

        // tar at mid case found
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on l1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {

                // case b right

                return search(arr, tar, mid + 1, ei);
            }

        }

        // on line 2

        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }

            else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 0, 1, 2 };
        int tar = 1;
        int tarIdx = search(arr, tar, 0, arr.length - 1);
        System.out.println("Element is : " + tarIdx);

    }
}
