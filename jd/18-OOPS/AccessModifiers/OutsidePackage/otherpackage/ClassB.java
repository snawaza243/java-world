// package OutsidePackage.mypackage.otherpackage;

package OutsidePackage.otherpackage;
import mypackage.ClassA;

public class ClassB {
    // Accessing variables from ClassA in mypackage
    public void accessClassAVariables() {
        ClassA objA = new ClassA();
        // Can only access publicVarA, protectedVarA, and defaultVarA
        System.out.println("Public variable in ClassA accessed from ClassB: " + objA.publicVarA);
        System.out.println("Protected variable in ClassA accessed from ClassB: " + objA.protectedVarA);
        System.out.println("Default variable in ClassA accessed from ClassB: " + objA.defaultVarA);

        // PrivateVarA cannot be accessed as it's private to ClassA
    }
}
