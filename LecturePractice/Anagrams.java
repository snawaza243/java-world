class Anagrams {
    public static void main(String[] args) {
        String str1 = "armin";
        String str2 = "minar";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int length1 = str1.length();
        int length2 = str2.length();

        int sum1 = 0;
        int sum2 = 0;

        if (length1 == length2) {
            for (int i = 0; i < length1; i++) {
                sum1 = sum1 + (int) str1.charAt(i);
                sum2 = sum2 + (int) str2.charAt(i);
            }
            if (sum1 == sum1) {
                System.out.println("Yes, strings are similar");
            }
        } else {
            System.out.println("No, string are not similar");
        }
    }
}