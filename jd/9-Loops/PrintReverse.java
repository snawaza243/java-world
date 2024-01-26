
public class PrintReverse {
    public static void main(String[] args) {
        int num = 12345;

        // for (int i = num; num > 0; num /= 10) {
        // int lastDigit = num % 10;
        // System.out.print(lastDigit);
        // }

        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num /= 10;

        }
    }
}
