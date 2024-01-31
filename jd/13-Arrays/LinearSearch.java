public class LinearSearch {

    public static int linearSearch(int arr[], int key) {
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6, 7, 8, 1 };
        int key = 7;
        int index = linearSearch(num, key);

        if (index == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Key is " + index);
        }

    }
}
