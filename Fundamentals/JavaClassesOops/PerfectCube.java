import java.math.*;

public class PerfectCube {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count1++;
            }
        }
        System.out.println("Number of even number: " + count1);

        int arr2[] = { 1, 8, 64, 5, 125, 10, 9 };
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            int yourThree = (int) (Math.cbrt(arr2[i]));
            int myThree = yourThree * yourThree * yourThree;

            if (myThree == arr2[i]) {
                System.out.print(arr2[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total perfect cube number: " + count);
    }
}