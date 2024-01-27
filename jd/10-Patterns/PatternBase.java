/*

* 
* *
* * *
* * * *


 */
public class PatternBase {
    public static void main(String[] args) {

        // right angle
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Square
        // for(int line = 1; line<=4; line++)
        // {
        // for(int col = 1; col <=4; col++)
        // {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
    }
}
