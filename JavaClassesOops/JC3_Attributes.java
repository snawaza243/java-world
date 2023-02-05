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
        JC3_Attributes myObj1 = new JC3_Attributes();
        System.out.println(myObj1.x);

        // updating value of x and z
        myObj1.x = 33;
        // myObj1.z = 11; //error can not reassign final variable

        System.out.println(myObj1.x);
        System.out.println(myObj1.z);

        // access reassigned attribute with another object

        JC3_Attributes myObj2 = new JC3_Attributes();

        System.out.println(myObj2.x); // 2
        System.out.println(myObj1.x); // 33

        JC3_Attributes myObj3 = new JC3_Attributes();

        System.out.println("Name: " + myObj3.fname + myObj3.lname);
        System.out.println("Age: " + myObj3.age);
    }
}