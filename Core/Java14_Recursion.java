public class Java14_Recursion {
    public static int rec1_NumSum(int x) {
        if (x > 0) {
            System.out.println(x);
            return x + rec1_NumSum(x - 1);
        }
        System.out.println();
        return 0;
    }

    public static int rec2_Factorial(int n) {
        if (n < 0) {
            System.out.println("Please enter a valid number.");
            return 0;
        } else if (n == 0) {
            return 1;
        }
        return n * rec2_Factorial(n - 1);
    }

    static int TailRecFact(int n, int a) {
        if (n <= 0)
            return a;
        return TailRecFact(n - 1, n * a);

    }

    static int rec3_TRFact(int n) {
        return TailRecFact(n, 1);
    }

    public static void main(String[] args) {

        // sum of input with recursion
        // System.out.println(rec1_NumSum(20));
        // System.out.println(rec2_Factorial(-45));
        System.out.println(rec3_TRFact(5));

    }
}
