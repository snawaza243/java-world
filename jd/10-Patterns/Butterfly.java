/*

*       *
**     **
***   ***
**** ****
**** ****
***   ***
**     **
*       *

 */
public class Butterfly {
    public static void main(String[] args) {
        int i, j;
        int n = 4;

        // upper part
        for (i = 1; i <= n; i++) {

            // upper left star
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // upper space
            for (int k = i; k <= 2 * n - i; k++) {
                System.out.print(" ");
            }

            // upper right star
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (i = 1; i <= n; i++) {

            // lower left part start
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            // lower space after lower left star
            for (int k = 2; k <= i * 2; k++) {
                System.out.print(" ");
            }

            // lower right star
            for (int l = 1; l <= n - i + 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
