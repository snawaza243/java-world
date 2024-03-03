public class OOPO_QNA10 {

    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();

        System.out.println("Result " + Test.a + Test.b); // 1030

        System.out.println("Result " + (Test.a + Test.b)); // 40
    }
}

class Test {
    static int a = 10;
    static int b;

    static void changeB() {
        b = a * 3;
    }
}