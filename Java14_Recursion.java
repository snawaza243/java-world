public class Java14_Recursion {
    public static int recursion1(int x) {
        if (x > 0) {
            System.out.println(x);
            return x + recursion1(x - 1);
        }
        System.out.println();

        return 0;
    }

    public static void main(String[] args) {

        // sum of input with recursion
        // System.out.println(recursion1(20));
        

    }
}
