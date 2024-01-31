public class LargestNum {

    public static int largestNum(int num[]) {

        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (l < num[i]) {
                l = num[i];
            }
            if (s > num[i]) {
                s = num[i];
            }
        }
        System.out.println("Smallest value = " + s);

        return l;

    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6, 9, 4 };
        System.out.println(largestNum(num));

    }
}
