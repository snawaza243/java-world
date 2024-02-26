public class OOPS_D_Ctr {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sid";
        // System.out.println("Student name: " + s1.name); // default

        Teacher t1 = new Teacher();
        t1.name = ("John");
        // System.out.println("Teacher Name: " + t1.name);

        // Master m1 = new Master(); // error parameter-less constructor
        Master m1 = new Master("Neil");
        // System.out.println("Master's name is : " + m1.name);

        SuperMaster sm = new SuperMaster();

    }
}

// without constructor define
class Student {
    String name;
    int roll;
}

// with constructor defining define and not passing anything
class Teacher {
    String name;

    Teacher() {
    }
}

// with constructor define with parameter
class Master {
    String name;

    Master(String name) {
        this.name = name;
    }
}

// with constructor define and notify on object creation
class SuperMaster {
    String name;

    SuperMaster() {
        System.out.println("Constructor is called");
    }
}