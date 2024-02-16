public class Q_BM_IsPowerOfN {

    public static boolean isPowerOfN(int n) {
        return (n & n - 1) == 0;
    }

    public static void main(String[] args) {

        System.out.println(isPowerOfN(4 + 1));

    }
}
