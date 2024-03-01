public class OOPN_ConstructorChain {
    public static void main(String[] args) {

        // new Temp();

        Derived obj = new Derived("test");
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
