import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // int num = 12345;
        int rev = 0;

        // while (num > 0) {
        // int lastDigit = num % 10;
        // rev = rev * 10 + lastDigit;
        // num /= 10;
        // }

        for (int i = num; num > 0; num /= 10) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
