public class OOPI_Poly {
    public static void main(String[] args) {
        Cal c1 = new Cal();
        System.out.println(c1.sum(4, 5));
        System.out.println(c1.sum((float) 12.42, (float) 34.54));
        System.out.println(c1.sum(2, 5, 4));
    }
}

// compile time (method overloading)
class Cal {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }
}