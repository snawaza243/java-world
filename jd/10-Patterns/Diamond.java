/*

    *
   ***
  *****
 *******
 *******
  *****
   ***
    *

 */
public class Diamond {
    public static void main(String[] args) {
        int i, j, k, l;

        int n = 4;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= 2 * i - 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (k = 1; k <= 2 * n - 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
