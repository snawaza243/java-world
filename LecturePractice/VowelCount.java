public class VowelCount {
    static void countVowel(String str) {

        for (int i = 0; i < str.length(); i++) {

        }

    }

    public static void main(String[] args) {
        Character a = 'a';
        Character z = 'z';
        for (int i = a; i < z; i++) {
            Character textValue =(char) (i);
            int numValue = (int) (i);
            System.out.println(textValue + " = " + numValue);
        }
        // int c = Integer.parseInt(args[a]);
        // int b = (int) (a);
        // System.out.println(b);
    }
}
