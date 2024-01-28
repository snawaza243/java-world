public class MethQBinaryToDec {

    public static void biToDec(int bi) {
        int binaryValue = bi;
        int pow = 0;
        int dec = 0;

        while (bi > 0) {
            int ld = bi % 10;
            dec = dec + (ld * (int) Math.pow(2, pow));
            pow++;
            bi = bi / 10;

        }

        System.out.println("Decimal of " + binaryValue + " = " + dec);
    }

    public static void main(String[] args) {
        biToDec(101);
    }
}
