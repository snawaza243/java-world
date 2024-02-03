import java.util.Scanner;

public class ArrayIO {

    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        // arr[0] = sc.nextInt();
        // arr[1] = sc.nextInt();
        // arr[2] = sc.nextInt();

        // System.out.println("Array values: " + arr[0]);
        // System.out.println("Array values: " + arr[1]);
        // System.out.println("Array values: " + arr[2]);

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
