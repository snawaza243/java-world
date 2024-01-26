import java.util.*;

public class WhileSumOf1N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to get sum: ");
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;

        while (count <= n) {
            sum += count;
            count++;
        }
        System.out.println("Sum of " + n + " is " + sum);
    }
}
