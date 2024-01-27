/*

     1 
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5

 
 */
public class NumberPyra {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (k = 2; k <= i + 1; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
