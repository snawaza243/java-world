package otherpackage;
import mypackage.ClassA;

public class SubclassB extends ClassA {
    // Accessing variables from ClassA in mypackage from a subclass
    public void accessClassAVariables() {
        // Can access protectedVarA, defaultVarA, and publicVarA
        System.out.println("Protected variable in ClassA accessed from SubclassB: " + protectedVarA);
        System.out.println("Default variable in ClassA accessed from SubclassB: " + defaultVarA);
        System.out.println("Public variable in ClassA accessed from SubclassB: " + publicVarA);

        // PrivateVarA cannot be accessed as it's private to ClassA
        // System.out.println("Private variable in ClassA accessed from SubclassB: " + privateVarA);
    }
}
