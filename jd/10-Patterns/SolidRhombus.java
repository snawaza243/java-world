/*

          * * * * * 
        * * * * *
      * * * * *
    * * * * *
  * * * * *
  
 */
public class SolidRhombus {
    public static void main(String[] args) {
        int i, j;
        int n = 5;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
