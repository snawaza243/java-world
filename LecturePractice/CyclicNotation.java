import java.util.*;

public class CyclicNotation {
    public static void main(String[] args) {

        // String s1 = "ABCD";
        String s2 = "CDAB";
        String s3 = "CDBA";

        StringBuffer s1 = new StringBuffer("ABCD");
        s1.append(s1);
        int s1_length = s1.length();
        int s2_length = s2.length();

        boolean isContain = s1.Contains(s2);

        // System.out.println("S1 length: " + s1_length);
        // System.out.println("S2 length: " + s2_length);

        // for (int i = 0; i < s1_length; i++) {
        //     for (int j = 0; j < s2_length; j++) {
        //         if (s1.charAt(i) == s2.charAt(0)) {

        //             System.out.println(s1.charAt(j));
        //             break;

        //         }
        //     }

        // }

        // int s1_length = s1.length();
        // for(int i=0; i<2*s1_length; i++){
        // String s11 = s11.append((s1.charAt(i) + s1.charAt(i)));
        // }

    }
}
