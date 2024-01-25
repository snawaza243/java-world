import java.util.Scanner;

public class ThreeLargestNu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();

        System.out.print("Enter num2: ");
        int b = sc.nextInt();

        System.out.print("Enter num3: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is largest");
        } else if (b >= a && b >= c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }

    }
}
