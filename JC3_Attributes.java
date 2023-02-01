class JC3_Attributes {
    int x = 2;
    int y = 44;

    // introduce final to do not update
    final int z = 22;

    // multiple attributes
    String fname = "John";
    String lname = "Doe";
    int age = 22;

    public static void main(String[] args) {

        // creating an object class and accessing attribute with
        JC3_Attributes obj31 = new JC3_Attributes();
        System.out.println(obj31.x);

        // updating value
        obj31.x = 33;
        System.out.println(obj31.x);

        System.out.println(obj31.z);

        // obj31.z = 11; //error can not reassign final variable

        JC3_Attributes obj2 = new JC3_Attributes();
        JC3_Attributes obj3 = new JC3_Attributes();

        System.out.println("Name: " + obj2.fname + obj2.lname);
        System.out.println("Age: " + obj2.age);
    }
}