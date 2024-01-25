import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int a = sc.nextInt();

        if (a % 4 == 0) {
            System.out.print("Leap Year");
        } else if (a % 100 == 0) {
            System.out.print("Leap Year");
        } else if (a % 400 == 0) {
            System.out.print("Leap Year");

        } else {
            System.out.println("Not leap year");
        }
    }
}
