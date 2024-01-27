/*
 A 
 B  C
 D  E  F
 G  H  I  J
 K  L  M  N  O
 */
public class CharRightAngle {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
