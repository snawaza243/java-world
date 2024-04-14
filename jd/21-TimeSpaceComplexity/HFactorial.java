public class HFactorial {
    

        // Function to calculate factorial
        public static long factorial(int n) {
            if (n == 0 || n == 1) {
                return 1; // Factorial of 0 and 1 is 1
            }
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    
        // Function to calculate time complexity of factorial
        public static void calculateTimeComplexity(int n) {
            long startTime = System.nanoTime();
    
            // Call factorial function
            factorial(n);
    
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
    
            System.out.println("Time complexity for factorial: O(n), Time taken: " + duration + " nanoseconds");
        }
    
        // Function to calculate space complexity of factorial
        public static void calculateSpaceComplexity() {
            // Additional space used is constant, O(1)
            System.out.println("Space complexity for factorial: O(1)");
        }
    
        public static void main(String[] args) {
            int num = 5; // Factorial of 5 (5!)
    
            // Calculate time complexity
            calculateTimeComplexity(num);
    
            // Calculate factorial
            long result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
    
            // Calculate space complexity
            calculateSpaceComplexity();
        }
    }
    