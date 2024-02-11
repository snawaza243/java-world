import java.util.Scanner;

public class StringPalindrome {

    public static boolean pd1(String str) {
        int startIndex = 0;
        int endIndex = str.length() - 1;

        while (startIndex < endIndex) {
            // if (!Character.isLetterOrDigit(str.charAt(startIndex))) {
            //     startIndex++;
            //     continue;
            // }
            // if (!Character.isLetterOrDigit(str.charAt(endIndex))) {
            //     endIndex--;
            //     continue;
            // }

            if (Character.toLowerCase(str.charAt(startIndex)) != Character.toLowerCase(str.charAt(endIndex))) {
                return false;
            }

            startIndex++;
            endIndex--;
        }

        return true;
    }

    public static void pd2(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("String is not palindrome");
                return;
            }

        }
        System.out.println("String is palindrome");
    }

    public static boolean pd3(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noonn";

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter text to check palindrome: ");
        // String str = sc.nextLine();

        System.out.println(pd1(str));

    }
}
