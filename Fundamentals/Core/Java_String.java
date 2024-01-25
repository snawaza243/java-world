import java.text.NumberFormat.Style;

class Java_String {
  public static void main(String[] args) {
    // Java String
    String str_var = "My new java string and methods";
    System.out.println(str_var);
    System.out.println("String Length: " + str_var.length());
    System.out.println("String upper case: " + str_var.toUpperCase());
    System.out.println("String lower case: " + str_var.toLowerCase());
    System.out.println("String index of w: " + str_var.indexOf("w"));
    System.out.println("String index of string: " + str_var.indexOf("str"));

    // method 1: string to character
    for (int i = 0; i < str_var.length(); i++) {
      System.out.println("Idex of " + str_var.charAt(i) + " is " + i);
    }

    // method 2: string to character char array
    char[] ch = str_var.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      System.out.println("Character at " + i + " index is " + ch[i]);
    }

    // concatenation of string
    int num_only1 = 12;
    int num_only2 = 12;
    System.out.println(num_only1 + num_only2);

    String num_str1 = "12";
    String num_str2 = "12";
    System.out.println(num_str1 + " " + num_str2);

    String first_name = "Sam";
    String last_name = "Sid";

    // concat() method
    // System.out.println(num_only1.concat(num_only2)); //error
    System.out.println(num_str1.concat(num_str2));
    System.out.println(first_name.concat(last_name));


    // string special Character

    // System.out.println("I like "Avenger" movie"); //error
    System.out.println("I like \"Avenger\" movie");
    System.out.println("This is Ram's house. ");
    System.out.println("Avenger\\Iron man and ");



  }
}