package OutsidePackage.otherpackage;

import otherpackage.ClassB;

public class Main {
    public static void main(String[] args) {
        // Creating an object of ClassB
        ClassB objB = new ClassB();

        // Accessing variables from ClassA within ClassB
        objB.accessClassAVariables();
    }
}
