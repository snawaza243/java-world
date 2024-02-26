
public class OOPG_Shallow {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Sam";
        s1.roll = 123;

        s1.pass = "abcd";
        s1.marks[0] = 95;
        s1.marks[1] = 96;
        s1.marks[2] = 97;

        Student s2 = new Student(s1);
        s2.pass = "xyz";
        s1.marks[2] = 33;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String pass;
    int marks[];

    Student(Student s1) {
    marks = new int[3];
    this.marks = s1.marks;
    this.name = s1.name;
    this.roll = s1.roll;
    }


    Student() {
        marks = new int[3];
    }
}