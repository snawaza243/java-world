public class J_Grid_Optimize {

    public static int findTotalPaths(int n, int m) {
        // Calculate total steps needed to reach bottom-right corner
        int totalSteps = (n - 1) + (m - 1);

        // Calculate permutations of down and right movements
        int downSteps = n - 1;
        int rightSteps = m - 1;
        int permutations = factorial(totalSteps) / (factorial(downSteps) * factorial(rightSteps));
        return permutations;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // TC = linear O(n+m)
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int totalPaths = findTotalPaths(n, m);
        
        // Print the count of paths
        System.out.println("Total paths: " + totalPaths);
    }


}
