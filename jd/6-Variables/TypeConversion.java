import java.util.Scanner;

public class TypeConversion {
    int a = 10;
    int b = 50;
    float c = (float) a;
    double d = (double) b;

    Scanner sc = new Scanner(System.in);

    // this is not possible
    // int n1 = sc.nextFloat();
    // int n2 = sc.nextFloat();

    // this can be possible
    float f1 = sc.nextInt();
    float f2 = sc.nextInt();


}
