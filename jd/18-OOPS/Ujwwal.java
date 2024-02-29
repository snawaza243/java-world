/**
 * Ujwwal
 */
public class Ujwwal {

    public static void main(String[] args) {

        A a1 = new B();

        ;

        System.out.println(a1.sum(1, 3));

        B b1 = new B();
        System.out.println(b1.sum(2, 4));

    }
}

class A {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b;
    }


}

class B extends A {
    public int sum(int a, int b) {
        return a + b;
    }
}