
public class ContinueStatement {
    public static void main(String[] args) {

        int count = 1;
        while (count <= 10) {
            if (count == 5) {
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }
        // for (int i = 0; i <= 10; i++) {
        // if (i == 4) {
        // continue;
        // }
        // System.out.println(i);
        // }
    }
}
