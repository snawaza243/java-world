public class MethPrimeNo {

    public static boolean isPrime(int n) {

        boolean isPrime = true;

        // corner case
        if (n == 1) {
            // nothing , it's not a prime number or composite
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;

    }

    public static boolean isPrimeRed(int n) {

        // corner case
        if (n == 1) {
            // nothing , it's not a prime number or composite
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean isPrimeOpt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Result = " + isPrime(2));
        System.out.println("Result = " + isPrimeRed(2));
        System.out.println("Result = " + isPrimeOpt(2));

    }

}
