import java.util.Scanner;

public class Q_S_CountLowerVowels {

    public static int countVowelCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currChar = (str.charAt(i));
            if (currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u') {
                count++;
            }

        }

        return count;

    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // String inputStr = sc.nextLine();
        // System.out.println("Number of Lowercase Vowels: " +
        // countVowelCase(inputStr));

        String str = new Scanner(System.in).nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;

            }

        }
        System.out.println("Total lower case interned input: " + count);
    }
}
