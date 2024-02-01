public class SubArrayMaxSum {
    public static void maxSumSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                int curSum = 0;
                for (int k = start; k <= end; k++) {
                    curSum += arr[k];

                    if (curSum > maxSum) {
                        maxSum = curSum;
                    }
                }
                System.out.print(curSum + " \t");
            }

            System.out.println();
        }
        System.out.println("Max sub array sum = " + maxSum);
    }

    public static void main(String[] args) {

        int arr[] = { 1, -2, 6, -1, 3 };

        maxSumSubArray(arr);
    };
}
