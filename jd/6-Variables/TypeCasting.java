import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 123;
        float b = a;

        float c = 234.2f;
        // int d = c; // lossy conversion from float to int not allow
        int d = (int) c; // with lossy conversion
        System.out.println(b);
    }
}
