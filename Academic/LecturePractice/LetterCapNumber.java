public class LetterCapNumber {
    public static void main(String[] args) {
        char A = 'A';
        char Z = 'Z';
        for(int i=A; i<Z; i++)
        {
            char charValue = (char)(i);
            int numValue = (int) (i); // no need direct put

            System.out.println(charValue + " = " + numValue);
        }
    }
}
