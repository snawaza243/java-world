public class Java13_Method {
    static void method1(String name) {
        System.out.println("Hello " + name);
    }

    static void method2(String fname) {
        System.out.println(fname + " Sid");
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

    static void method7(int age) {
        if (age < 18) {
            System.out.println("You are not allowed");
        } else {
            System.out.println("You are allowed");

        }
    }

    public static void main(String[] args) {

        // method1("Sam");
        // method2("Sam");
        // method3("Sam", "Sid", 22);
        System.out.println(method4(20));
        System.out.println(method5(20, 2));
        System.out.println("Total age: " + method6(2022, 2002));
        method7(20);
    }
}
