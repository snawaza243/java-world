import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        while (n > 0) {
            int last = n % 10;
            System.out.print(last);
            if (last % 2 == 0) {
                evenSum += last;
            } else {
                oddSum += last;
            }
            n /= 10;
        }

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
    }
}
