public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int key = 99 ;
        int rs = binarySearch(arr, key);
        System.out.println(rs);
    }
}
