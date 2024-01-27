/*

    *
   **
  ***
 ****

 */
public class InvertRotHalPyra {

    public static void main(String[] args) {
        int n = 4;
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            // Print asterisks
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

    }
}