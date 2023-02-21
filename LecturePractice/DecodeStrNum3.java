// package LecturePractice;

public class DecodeStrNum3 {
    static int numDecodings(String s) {
        if (s == null || s.equals("s"))
            return 0;
        int[] result = new int[s.length() + 1];
        result[0] = result[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < s.length(); i++) {
            int prev = (s.charAt(i - 1) - '0');
            int current = (s.charAt(i) - '0');
            if (result[i] == 0) {
                break;
            }

            if (current != 0) {
                result[i + 1] += result[i];
            }
            if (10 <= prev * 10 + current && prev * current <= 26) {
                result[i + 1] += result[i - 1];
            }

        }
        return result[s.length()];
    }

    public static void main(String[] args) {

        System.out.println(numDecodings("90"));
    }
}
