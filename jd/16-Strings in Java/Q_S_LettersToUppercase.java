public class Q_S_LettersToUppercase {
    public static String lettersToUpper(String str) {
        int n = str.length();
        StringBuffer sb = new StringBuffer("");
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

    public static void main(String[] args) {
        String str = "hello this is the lower, and uppercase converter";

        System.out.println(lettersToUpper(str));
    }
}
