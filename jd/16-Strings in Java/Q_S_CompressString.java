public class Q_S_CompressString {

    public static String compress(String str) {
        int n = str.length();
        String newStr = "";
        for (int i = 0; i < n; i++) {
            Integer count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i+1)) {
                i++;
                count++;
            }
            newStr += str.charAt(i);

            if (count > 1) {
                newStr += count.toString();
            }

        }
        return newStr;

    }

    public static void main(String[] args) {
        String str = "aaabccdeeff";

        // int n = str.length();
        // String newStr = "";
        // for (int i = 0; i < n; i++) {
        // Integer count = 1;
        // while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
        // i++;
        // count++;
        // }
        // newStr += str.charAt(i);
        // if (count > 1) {
        // newStr += count.toString();
        // }
        // }
        // System.out.println(newStr);

        System.out.println(compress(str));

    }
}
