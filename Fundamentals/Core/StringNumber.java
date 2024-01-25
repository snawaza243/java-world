import org.w3c.dom.TypeInfo;

class StringNumber {
    public static void main(String[] args) {

        System.out.println("This is my string");
        String s = "Java is a language";
        System.out.println(s);

        System.out.println(15);
        int n = 10;
        System.out.println(n);

        System.out.println(s + s);
        System.out.println(s + " " + s);

        System.out.println(n + n); // 20
        System.out.println(n + " " + n);// 10 10

        System.out.println(s + n);
        System.out.println(s + " " + n);

    }
}