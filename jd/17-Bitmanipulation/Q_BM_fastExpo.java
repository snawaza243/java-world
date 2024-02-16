/**
 * Q_BM_fastExpo
 */
public class Q_BM_fastExpo {

    public static int fastExpo(int n, int x) {
        int ans = 1;
        while (x> 0) {
            if ((x & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            x = x >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(4, 3));

    }
}