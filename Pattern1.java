import java.util.regex.Pattern;

public class Pattern1 {
     static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        /*
         * 
         * * * * *
         * * * *
         * * *
         * *
         * 
         */

    }

    public static void pattern1(int n) {
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        /*
         * 
         * 
         * *
         * * *
         * * * *
         * * * * *
         * 
         */
    }
}