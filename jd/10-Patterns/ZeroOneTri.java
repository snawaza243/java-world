
/*
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */


public class ZeroOneTri {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        int state;
        for (i = 1; i <= n; i++) {
            state = (i % 2 == 0) ? 0 : 1;
            for (j = 1; j <= i; j++) {
                System.out.print(state + " ");
                state = (state == 1) ? 0 : 1;
            }
            System.out.println();
        }
    }
}
