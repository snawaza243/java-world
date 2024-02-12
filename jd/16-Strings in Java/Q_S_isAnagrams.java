import java.util.Arrays;

public class Q_S_isAnagrams {

    public static boolean isAnagrams(String str1, String str2) {

        // making lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check both length
        if (str1.length() == str2.length()) {

            // making str to character
            char[] charArrStr1 = str1.toCharArray();
            char[] charArrStr2 = str2.toCharArray();

            // sorting converted character arrays
            Arrays.sort(charArrStr1);
            Arrays.sort(charArrStr2);

            // comparing with equals to sorted character array in boolean
            boolean rs = Arrays.equals(charArrStr1, charArrStr2);
            if (rs) {

                // if return 0 on the comparing
                System.out.println("Both are anagrams");
                return true;
            }
        }
        System.out.println("Both are not anagrams");

        return false;
    }

    public static void main(String[] args) {
        String a = "earth";
        String b = "heart";
        System.out.println(isAnagrams(a, b));
    }
}
