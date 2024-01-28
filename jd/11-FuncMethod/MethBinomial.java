public class MethBinomial {

    public static int findFact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }

    public static int binomialCoefficient(int n, int r) {
        int fact_n = findFact(n);
        int fact_r = findFact(r);
        int n_r = findFact(n - r);
        int ncr = (fact_n) / (fact_r * n_r);
        return ncr;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println("Binomial Coefficient: " + binomialCoefficient(a, b));
    }
}
