// import mypackage.*;

package mypackage;

// File: Main.java

public class Main {
    public static void main(String[] args) {
        // Creating an object of ClassA
        ClassA objA = new ClassA();

        // Creating an object of ClassB to access ClassA variables
        ClassB objB = new ClassB();
        objB.accessClassAVariables();
    }
}
