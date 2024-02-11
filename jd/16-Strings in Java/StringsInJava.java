import java.util.Scanner;

public class StringsInJava {

    public static void main(String[] args) {

        // 8. compareTo()

        String str1 = "B";
        String str2 = "b";

        // System.out.println(str1.compareTo(str2));
        int r = str1.compareTo(str2);
        // int r = str1.compareToIgnoreCase(str2);


        if (r == 0) {
            System.out.println("Is Equal");
        } else if (r < 0) {
            System.out.println("str1 Smaller than str2");
        } else if (r > 0) {
            System.out.println("str1 is larger than str2");
        }

        // 7. .substring(si, ei)
        // String str ="Hello World";
        // System.out.println(str.substring(0 , 5));

        // String functions:
        // 6. .equals function and comparison operator
        // String str1 = "Sam";
        // String str2 = "Sam";
        // String str3 = new String("Sam");

        // if (str1 == str2) {
        // System.out.println("1, 2 equal");
        // } else {
        // System.out.println("1, 2, not equal");
        // }

        // if (str2 == str3) {
        // System.out.println("2, 3 equal ");
        // } else {
        // System.out.println("2, 3 not equal");
        // }

        // with .equals() function
        // if (str1.equals(str2)) {
        // System.out.println("1, 2 equal");
        // } else {
        // System.out.println("1, 2, not equal");
        // }

        // if (str2.equals(str3)) {
        // System.out.println("2, 3 equal ");
        // } else {
        // System.out.println("2, 3 not equal");
        // }

        // 5. charAt() function
        // String str6 = "Sam Edward";
        // System.out.println(str6.charAt(3));

        // 4. string concatenation

        // String f_name = "Sam";
        // String l_name = "Edward";
        // String l_name_1 = " Edward";

        // String full_Name = f_name + " " + l_name;
        // String full_Name = f_name.concat(l_name_1);
        // System.out.println(full_Name);

        // 3. String length

        // String str5 = "Hello World!";
        // int arr2[] = {1,2,3,4,5,6};
        // System.out.println(str5.length());
        // System.out.println(arr2.length);

        // 2. string input output

        // Scanner sc = new Scanner(System.in);
        // String str4 = new String();
        // String str4;
        // str4 = sc.next();
        // str4 = sc.nextLine();
        // System.out.println("Your input: " + str4);

        // 1. String declaration

        // String str1 = "Sam";
        // System.out.println(str1);

        // String str2 = new String("Sam");
        // System.out.println(str2);

        // char[] str3 = { 's', 'a', 'm' };
        // System.out.println(str3);

        // int arr1[] = { 1, 2, 3, 4, 5 };
        // for (int i : arr) {
        // System.out.print(arr[i - 1] + " ");
        // }
        // System.out.println();

    }
}
