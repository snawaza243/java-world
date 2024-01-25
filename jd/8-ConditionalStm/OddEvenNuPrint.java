import java.util.Scanner;

public class OddEvenNuPrint {
    public static void main(String[] args) {
        /**
         * even: divisible by 2, and num%2 == 0
         * odd: not divisible by 2
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
