/*

1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1

 */
public class InvertHalfPyraNum {
    public static void main(String[] args) {
        int n = 5;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n - rows + 1; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
