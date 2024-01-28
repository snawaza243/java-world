public class MethFunOverloading {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Sum 1 = " + sum(10, 34));
        System.out.println("Sum 2 = " + sum(10, 34, 88));
        System.out.println("Sum 3 = " + sum(10, 34));
        System.out.println("Sum 4 = " + sum(10, 34, 88));

    }
}
