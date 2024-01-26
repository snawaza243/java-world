import java.util.Scanner;

public class ContinuePrintExcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            // print number, except to 10th multiple
            if (n % 10 == 0) {
                System.out.println("Sorry! next time");
                continue;
            }
            System.out.println("Your number: " + n);
            ;
        } while (true);

    }
}
