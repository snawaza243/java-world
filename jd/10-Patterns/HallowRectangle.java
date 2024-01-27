/*

********************
*                  *
*                  *
*                  *
********************

 */
public class HallowRectangle {
    public static void main(String[] args) {
        int m = 5, n = 20;

        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == m || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
