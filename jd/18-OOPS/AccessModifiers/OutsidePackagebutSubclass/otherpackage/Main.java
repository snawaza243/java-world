import otherpackage.SubclassB;

public class Main {
    public static void main(String[] args) {
        // Creating an object of SubclassB
        SubclassB objB = new SubclassB();

        // Accessing variables from ClassA within SubclassB
        objB.accessClassAVariables();
    }
}
