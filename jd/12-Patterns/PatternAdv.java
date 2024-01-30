
public class PatternAdv {

    public static void hollowRectangle(int n, int m) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRotatedHalfPyra(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyrNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void folydsTri(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterFly(int n) {
        for (int upper = 1; upper <= n; upper++) {
            for (int upperLeftStart = 1; upperLeftStart <= upper; upperLeftStart++) {
                System.out.print("*");
            }
            for (int upperSpace = 1; upperSpace <= 2 * (n - upper); upperSpace++) {
                System.out.print(" ");
            }

            for (int upperRightStart = 1; upperRightStart <= upper; upperRightStart++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int lower = n; lower > 0; lower--) {
            for (int lowerLeftStart = 1; lowerLeftStart <= lower; lowerLeftStart++) {
                System.out.print("*");
            }

            for (int lowerSpace = 1; lowerSpace <= 2 * (n - lower); lowerSpace++) {
                System.out.print(" ");
            }

            for (int lowerRightStart = 1; lowerRightStart <= lower; lowerRightStart++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5, m = 10;
        // hollowRectangle(n, m);
        // invertedRotatedHalfPyra(n);
        // invertedHalfPyrNum(n);
        // folydsTri(n);
        // zeroOneTri(n);
        butterFly(n);
    }
}
