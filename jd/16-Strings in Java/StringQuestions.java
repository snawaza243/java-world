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

    public static void main(String[] args) {

        // 8. largest substring 

        System.out.println(printLargestString(args));


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
