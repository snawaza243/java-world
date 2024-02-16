public class Q_BM_countSetBit {

    public static int cntSetBit(int n) {
        int cnt = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                cnt++;
            }
            n = n >> 1;

        }
        return cnt;
    }

    public static void main(String[] args) {

        System.out.println(cntSetBit(9)); // 2
        System.out.println(cntSetBit(16)); // 2
    }
}
