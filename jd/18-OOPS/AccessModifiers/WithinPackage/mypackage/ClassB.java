package mypackage;

// File: ClassB.java

// ClassB within the same package
class ClassB {
    // Accessing variables from ClassA within the same package
    public void accessClassAVariables() {
        ClassA objA = new ClassA();
        System.out.println("Public variable in ClassA accessed from ClassB: " + objA.publicVarA);
        System.out.println("Protected variable in ClassA accessed from ClassB: " + objA.protectedVarA);
        System.out.println("Default variable in ClassA accessed from ClassB: " + objA.defaultVarA);
    }
}
