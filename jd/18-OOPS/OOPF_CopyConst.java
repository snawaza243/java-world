
public class OOPF_CopyConst {

    public static void main(String[] args) {

        // Student s1 = new Student();
        // s1.name = "Sam";
        // s1.roll = 123;

        // s1.pass = "abcd";
        // s1.marks[0] = 95;
        // s1.marks[1] = 96;
        // s1.marks[2] = 97;

        // Student s2 = new Student(s1);
        // s2.pass = "xyz";
        // s1.marks[2] = 33;

        // for (int i = 0; i < 3; i++) {
        // System.out.println(s2.marks[i]);
        // }

        // Creating object of class
        Complex c1 = new Complex(10, 15);

        // Following involves a copy constructor call
        Complex c2 = new Complex(c1);

        // Note: Following doesn't involve a copy
        // constructor call
        // as non-primitive variables are just references.
        Complex c3 = c2;

        // toString() of c2 is called here
        System.out.println(c2);

    }
}

class Student {
    String name;
    int roll;
    String pass;
    int marks[];

    Student() {
        marks = new int[3];
    }

    Student(Student s1) {
        marks = new int[3];
        this.marks = s1.marks;
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person another) {
        this(another.name, another.age);
    }

}

class Complex {
    private double re, im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    Complex(Complex c) {
        System.out.println("Copy constructor called");

        re = c.re;
        im = c.im;
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + ")";
    }
}