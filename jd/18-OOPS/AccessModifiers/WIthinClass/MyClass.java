public class MyClass {
    // Private variable - accessible only within the same class
    private int privateVar = 10;

    // Default variable - accessible within the same package
    int defaultVar = 20;

    // Protected variable - accessible within the same package and by subclasses
    protected int protectedVar = 30;

    // Public variable - accessible from anywhere
    public int publicVar = 40;

    // Constructor
    public MyClass() {
        // Accessing all variables within the same class
        System.out.println("Private variable: " + privateVar);
        System.out.println("Default variable: " + defaultVar);
        System.out.println("Protected variable: " + protectedVar);
        System.out.println("Public variable: " + publicVar);
    }

    // Method to access private variable
    public int getPrivateVar() {
        return privateVar;
    }

    // Method to modify private variable
    public void setPrivateVar(int value) {
        privateVar = value;
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass();

        // Accessing and modifying variables using methods
        System.out.println("Private variable after modification: " + obj.getPrivateVar());
        obj.setPrivateVar(50);
        System.out.println("Private variable after modification: " + obj.getPrivateVar());
    }
}
