import java.util.Scanner;

public class FactorialFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int fact = 1;

        if (n < 2) {
            System.out.println("Factorial is 1");
        } else {
            while (n > 0) {
                fact *= n;
                n--;
            }
            System.out.println("Factorial is " + fact);
        }
    }
}
