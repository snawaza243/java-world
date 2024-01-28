import java.util.Scanner;

public class MethSum {

    public static void printSum() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();

        System.out.print("Enter num2: ");
        int b = sc.nextInt();

        int su = a + b;
        System.out.println("Sum is " + su);
    }

    public static void main(String[] args) {

        printSub();
    }
}
