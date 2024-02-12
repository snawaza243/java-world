import java.util.Scanner;

public class StringQuestions {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();

            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static float findShortPath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'E') {
                x++;
            } else if (direction == 'W') {
                x--;
            }
        }

        int x_pow = x * x;
        int y_pow = y * y;

        int distance = (int) Math.sqrt(x_pow + y_pow);

        return distance;
    }

    public static String getSubstring(String str, int si, int ei) {
        String rs = "";

        for (int i = si; i < ei; i++) {
            rs += str.charAt(i);
        }
        return rs;
    }

    public static String printLargestString(String str[]) {
        String largest = str[0];
        for (int i = 0; i < str.length; i++) {

            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        return largest;
    }

    public static String printAlphaSB() {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch + " ");
        }

        return sb.toString();
    }

    public static String lettersToUpper(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == ' ' && i < n - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static String stringCompress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            // we need 2 string to add in string the count so use Integer class
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);

            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {

        String str = "This is a sample text replace character ";
        str = str.replace("a", "aa");
        System.out.println(str);

        // String str = "aabbcdddeer";
        // System.out.println(stringCompress(str));

        // 10. convert letters to toUpperCase
        // String str = "hi, i am sam.";
        // System.out.println(lettersToUpper(str));

        // 9. string builder
        // System.out.println(printAlphaSB());

        // 8. largest substring
        // String str[] = {"apple", "mango", "orange"};
        // System.out.println(printLargestString(str));

        // String str = "Hello World";
        // System.out.println(getSubstring(str, 0, 3));

        // String path = "WNEENESENNNW";
        // System.out.println(findShortPath(path));

        // String str = "noon";
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter text to check palindrome: ");
        // String str = sc.nextLine();
        // System.out.println(isPalindrome(str));

    }
}
