public class SubArrayMaxSumKadane {

    public static void subArrayMaxSumKadane(int arr[]) {
        int cs = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cs = arr[i];
            if (cs < 0) {
                cs = 0;
            }
            max = Math.max(max, cs);
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, 3, -1, 6 - 2 };

        subArrayMaxSumKadane(arr);

    }
}
