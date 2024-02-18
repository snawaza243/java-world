public class OOPS_E_ConstType {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Sam");
        Student s3 = new Student(22);
        Student s4 = new Student("Sid", 23);

        

    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constructor with out parameter");
    }

    Student(String name) {
        this.name = name;
        System.out.println("Constructor with one parameter called");
    }

    Student(int roll) {
        this.roll = roll;
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println("Constructor with two parameters called");
    }
}