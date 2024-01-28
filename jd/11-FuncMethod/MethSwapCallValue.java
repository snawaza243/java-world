public class MethSwapCallValue {

    public static void swapTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swapTemp(a, b);
        System.out.println("a = " + a + " b = " + b);

    }
}
