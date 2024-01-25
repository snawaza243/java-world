import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        // Scanner sc1 = new Scanner(System.in);
        // String input1 = sc1.next();
        // System.out.println(input1);

        // Scanner sc2 = new Scanner(System.in);
        // String input2 = sc2.nextLine();
        // System.out.println(input2);

        Scanner isc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n1;

        n1 = isc.nextInt();

        if (n1 > 0) {
            System.out.println("Your number " + n1);
        }

        Scanner stringScanner = new Scanner(System.in);
        String s1 = stringScanner.nextLine();
        System.out.println("You entered the text : " + s1);

    }
}
