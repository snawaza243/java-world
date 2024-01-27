/*
     1
    212
   32123
  4321234
 543212345
 */
public class PalindromicNumber {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5;

        for (i = 1; i <= n; i++) {
            int x = i;
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {

                System.out.print(x);
                x--;
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
