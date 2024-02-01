public class ArraySubArray {
    public static void subArray(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                System.out.print("[");
                int sum = 0;
                int max = Integer.MAX_VALUE;
                int min = Integer.MIN_VALUE;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                    sum += arr[k];

                    if (min < arr[k]) {
                        min = arr[k];
                    }
                    if (max > arr[k]) {
                        max = arr[k];
                    }
                }
                ts++;

                System.out.print("]");
                System.out.print("\t\tSum = " + sum + " \tMin = " + min + " \tMax = " + max);

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub array = " + ts);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8 };

        subArray(arr);
    }
}
