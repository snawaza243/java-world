public class MethFactorial {

    public static int fact(int x) {

        int f = 1;

        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        // while (x > 0) {
        // f *= x;
        // --x;
        // }

        return f;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Factorial is = " + fact(n));
    }
}
