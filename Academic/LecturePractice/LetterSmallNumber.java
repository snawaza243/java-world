public class LetterSmallNumber {
    public static void main(String[] args) {
        char a = 'a';
        char z = 'z';
        for (int i = a; i < z; i++) {
            char charValue = (char) (i);
            int numValue = (int) (i); // no need direct put
            System.out.println(charValue + " = " + numValue);
        }
    }
}
