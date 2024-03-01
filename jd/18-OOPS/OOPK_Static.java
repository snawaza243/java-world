public class OOPK_Static {
    public static void main(String[] args) {

        // Student s1 = new Student();
        // s1.name = "Sam";
        // s1.roll = 123;
        // s1.schoolName = "MMDU";
        // System.out.println(s1.name);

        // System.out.println(Test.x);

        // Test t1 = new Test();
        // Test t2 = new Test();

        // Create an instance of OuterClass
        OuterClass outerObj = new OuterClass(10);

        // Create an instance of NestedClass
        OuterClass.NestedClass nestedObj = outerObj.new NestedClass(20);

        // Display data using methods of OuterClass and NestedClass
        outerObj.displayOuterData();
        nestedObj.displayNestedData();
        nestedObj.accessOuterData();

    }
}

class Student {
    String name;
    int roll;
    static String schoolName;

    static int stdPer(int m, int p, int c) {
        return (m + c + p) / 3;
    }

}

class Test {

    Test() {
        System.out.println("Test constructor called");
    }

    static int x;

    static {
        x = 20;
        System.out.println("Printing from static block");
    }
}

class OuterClass {
    private int outerData;

    // Constructor for OuterClass
    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    // Method to display outer data
    public void displayOuterData() {
        System.out.println("Outer Data: " + outerData);
    }

    // Nested class
    public class NestedClass {
        private int nestedData;

        // Constructor for NestedClass
        public NestedClass(int nestedData) {
            this.nestedData = nestedData;
        }

        // Method to display nested data
        public void displayNestedData() {
            System.out.println("Nested Data: " + nestedData);
        }

        // Method to access outer class data
        public void accessOuterData() {
            System.out.println("Outer Data from NestedClass: " + outerData);
        }
    }
}
