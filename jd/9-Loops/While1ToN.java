import java.util.Scanner;

public class While1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.println(count + " ");
            count++;
        }
        System.out.println("Printed " + n + " numbers.");
    }

}
