public class LPower {

    // Function to calculate power of x raised to the power of y
    public static double power(double x, int y) {
        if (y == 0) {
            return 1;
        } else if (y > 0) {
            return x * power(x, y - 1);
        } else {
            return (1 / x) * power(x, y + 1);
        }
    }

    public static double power1(double x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * power2(x, y - 1);
    }

    public static double power2(double x, double y) {
        if (y == 0) {
            return 1;
        }
        double halfPower = power2(x, y / 2) * power2(x, y / 2);
        if (y % 2 != 0) {
            return x * halfPower;
        }
        return halfPower;
    }
    public static double power3(double x, double y) {
        if (y == 0) {
            return 1;
        }
        double halfPower = power2(x, y / 2);
        double hpSq = halfPower * halfPower;
        if (y % 2 != 0) {
            return x * hpSq;
        }
        return hpSq;
    }

    // Function to calculate time complexity of power function
    public static void calculateTimeComplexity(double x, int y) {
        long startTime = System.nanoTime();

        // Call power function
        power(x, y);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time complexity for power function: O(n), Time taken: " + duration + " nanoseconds");
    }

    // Function to calculate space complexity of power function
    public static void calculateSpaceComplexity() {
        // Additional space used is proportional to the recursion depth, O(n)
        System.out.println("Space complexity for power function: O(n)");
    }

    public static void main(String[] args) {
        double x = 2; // Base
        int y = 5; // Power

        // Calculate time complexity
        calculateTimeComplexity(x, y);

        // Calculate power
        double result = power(x, y);
        System.out.println(x + " raised to the power of " + y + " is: " + result);

        // Calculate space complexity
        calculateSpaceComplexity();
    }
}
