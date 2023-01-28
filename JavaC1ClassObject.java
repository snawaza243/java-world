public class JavaC1ClassObject {
    int x = 5;

    public static void main(String[] args) {
        JavaC1ClassObject myObj = new JavaC1ClassObject();
        System.out.println(myObj.x);

        JavaC1ClassObject obj1 = new JavaC1ClassObject();
        JavaC1ClassObject obj2 = new JavaC1ClassObject();

        System.out.println(obj1.x);
        System.out.println(obj2.x);

    }
}

class Second{
    public static void main(String[] args) {
        JavaC1ClassObject obj3 = new JavaC1ClassObject();
        System.out.println(obj3);
    }
}