
public class RecA {

    // print n number dec
    public static void fun1(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        fun1(n - 1);
    }

    // print n number inc
    public static void fun2(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        fun2(n - 1);
        System.out.println(n);
    }

    // calculate factorial
    public static int fun3(int n) {
        if (n == 0) {
            return 1;
        }

        int fac = n * fun3(n - 1);
        return fac;
    }

    // calculate sum of number
    public static int fun4(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = fun4(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static void main(String[] args) {

        // fun2(5);

        System.out.println(fun4(5));
    }

}