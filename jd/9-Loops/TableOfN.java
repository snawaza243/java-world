import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 1;
        while (count <= 10) {
            System.out.println("1 * " + count + " = " + count * n);
            count++;
        }
    }
}
