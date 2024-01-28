public class MethQDecToBi {

    public static void DecToBi(int n) {
        int bin = 0;
        int pow = 0;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            pow++;
            n /= 2;

        }

        System.out.println(bin);
    }

    public static void main(String[] args) {
        DecToBi(15);
    }
}
