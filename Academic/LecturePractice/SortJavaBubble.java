/*
 * Sorting: Bubble sort
 * 
 */

class SortJavaBubble {

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 5, 6 };
        int i, j, temp;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}