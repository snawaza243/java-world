package OutsidePackage.mypackage;

public class ClassA {
    // Private variable - accessible only within the same class
    private int privateVarA = 10;

    // Default variable - accessible within the same package
    int defaultVarA = 20;

    // Protected variable - accessible within the same package and by subclasses
    protected int protectedVarA = 30;

    // Public variable - accessible from anywhere
    public int publicVarA = 40;

    // Constructor
    public ClassA() {
        // Accessing all variables within the same class
        System.out.println("Private variable in ClassA: " + privateVarA);
        System.out.println("Default variable in ClassA: " + defaultVarA);
        System.out.println("Protected variable in ClassA: " + protectedVarA);
        System.out.println("Public variable in ClassA: " + publicVarA);
    }
}
