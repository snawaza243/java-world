import java.util.Scanner;

public class CheckPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("2 is Prime");
        } else {
            boolean isPrime = true;
            // for (int i = 2; i <= n -1; i++) {
            // for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

    }

}
