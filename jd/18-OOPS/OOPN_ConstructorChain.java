public class OOPN_ConstructorChain {
    public static void main(String[] args) {

        
        Derived obj = new Derived("test");
        
        // new Temp();

        
        // new Temp2(8, 10);

        // Object creation by calling no-argument constructor.
        // new Temp3();

        // Object creation by calling parameterized
        // constructor with one parameter.
        // new Temp3(10);

        // new Temp4();
        // new Temp4(10);

    }
}

// Constructor chaining within the same class using this() keyword
class Temp {
    Temp() {
        this(5);
        System.out.println("The Default constructor");
    }

    Temp(int x) {
        this(5, 15);
        System.out.println(x);
    }

    Temp(int x, int y) {
        System.out.println(x * y);
    }

}

// Constructor chaining to another class using super() keyword
class Base {
    String name;

    Base() {
        this("");
        System.out.println("No-argument constructor of base class");
    }

    Base(String name) {
        this.name = name;
        System.out.println("Calling parameterized constructor of base");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("No-argument constructor of derived");
    }

    Derived(String name) {
        super(name);
        System.out.println("Calling parameterized constructor of derived");
    }

}

// change the order of constructors

class Temp2 {
    // default constructor 1
    Temp2() {
        System.out.println("default");
    }

    // parameterized constructor 2
    Temp2(int x) {
        // invokes default constructor
        this();
        System.out.println(x);
    }

    // parameterized constructor 3
    Temp2(int x, int y) {
        // invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes parameterized constructor 3
    }
}

class Temp3 {
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }

    // no-arg constructor
    Temp3() {
        System.out.println("default");
    }

    // constructor with one argument.
    Temp3(int x) {
        System.out.println(x);
    }

}

class Temp4 {
    // block to be executed first
    {
        System.out.println("init");
    }

    Temp4() {
        System.out.println("default");
    }

    Temp4(int x) {
        System.out.println(x);
    }

    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }

}
