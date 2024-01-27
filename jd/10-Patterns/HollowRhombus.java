/*

               * * * * * 
            *       *
         *       *
      *       *
   * * * * *
   * 
 */
public class HollowRhombus {
    public static void main(String[] args) {
        int i, j, k, l;
        int m = 5;
        int n = 5;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print("   ");
            }

            for (k = 1; k <= m; k++) {
                if (i == 1 || i == n || k == 1 || k == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
