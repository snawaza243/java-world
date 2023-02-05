public class JC5_Constructor {
    // int a;
    // public JC5_Constructor() {
    // a = 5;
    // }

    // public static void main(String[] args) {
    // JC5_Constructor myObj = new JC5_Constructor();

    // System.out.println(myObj.a);
    // // for (int i = 0; i < 10; i++) {
    // // System.out.println(myObj.a);
    // // myObj.x++;
    // // }
    // }

    // 2. constructor parameter
    // int a;

    // public JC5_Constructor(int b) {
    // a = b;
    // }

    // public static void main(String[] args) {
    // JC5_Constructor myObj2 = new JC5_Constructor(40);

    // System.out.println(myObj2.a);

    // }

    // 3. multiple parameter

    int num;
    String name;

    public JC5_Constructor(int rollNum, String fullName) {
        num = rollNum;
        name = fullName;
    }

    public static void main(String[] args) {
        JC5_Constructor myObj3 = new JC5_Constructor(2722, "Sam Sid");
        System.out.println(myObj3.num + "\n" + myObj3.name);

    }

}