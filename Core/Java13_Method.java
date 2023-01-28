public class Java13_Method {
    static void method1(String name) {
        System.out.println(name);
    }

    static void method2(String fname) {
        System.out.println("Hello " + fname);
    }

    static void method3(String fname, String lname, int age) {
        System.out.println("\nHello" + fname + " " + lname);
        System.out.println("Your age is " + age);
    }

    static int method4(int num) {
        return 10 + num;
    }

    static int method5(int x, int y) {
        return x + y;
    }

    static int method6(int currentYear, int birthYear) {
        return currentYear - birthYear;
    }

    // method with if... else
    static void method7(int age) {
        if (age < 18) {
            System.out.println("You are not allowed");
        } else {
            System.out.println("You are allowed");

        }
    }

    // method overloading

    static int methodOverloading1(int a) {
        return a;
    }

    static float methodOverloading1(float a) {
        return a;
    }

    static double methodOverloading1(double a) {
        return a;
    }

    static int methodOverloading2(int x, int y) {
        return x + y;
    }

    static float methodOverloading2(float x, float y) {
        return x + y;
    }

    static double methodOverloading2(double x, double y) {
        return x + y;
    }

    static void methodScope() {
        int x = 12;
        System.out.println(x);

        // System.out.println(y)
        ; // error to access y
        int y = 45;
    }

    public static void main(String[] args) {

        // method1("Sam");
        // method2("Sam");
        // method3("Sam", "Sid", 22);
        // System.out.println(method4(20));

        // int storesValue = method5(20, 2);
        // System.out.println(storesValue);
        // System.out.println("Total age: " + method6(2022, 2002));
        // method7(20);

        // System.out.println(methodOverloading1(1));
        // System.out.println(methodOverloading1(1.3456765432345676543f));
        // System.out.println(methodOverloading1(234.233342342342352352352454534d));

        // int mo2_a = methodOverloading2(10, 20);
        // float mo2_b = methodOverloading2(30, 40);
        // double mo2_c = methodOverloading2(50, 60);

        // System.out.println("Int: " + mo2_a);
        // System.out.println("Float: " + mo2_b);
        // System.out.println("Double: " + mo2_c);

        // java method scope

        int x = 20;
        System.out.println(x); // accessible x

        // System.out.println(y); // error to access y
        int y = 30;

        {
            int z = 20;
            System.out.println(z); // accessible z
        }

        {
            // System.out.println(m); //error to access m
            int m = 40;
        }

    }
}
