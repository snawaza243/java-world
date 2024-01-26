import java.util.*;

public class BreakQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            
            if (n % 10 == 0) {
                System.out.println("You have entered 10th multiple");
                break;
            }
        }
    }
}
