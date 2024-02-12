
public class Q_BM_OddEven {
    public static void checkOddEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("Number is even");
        } else {

            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        checkOddEven(4);
    }
}
