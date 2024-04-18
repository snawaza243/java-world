import java.util.ArrayList;

public class A_ArrayListBasic {

    public static void main(String args[]) {
        /*
         * ArrayList: Builtin liner type data structure from java collection framework
         * (contain classes and interfaces).
         * No need to define form scratch but just use prebuilt operations and methods.
         * 
         * import java.util.ArrayList or import java.util.*
         * 
         * ArrayList<Type> myList = new(heap memory space create) ArrayList<>();
         * 
         * ArrayList: Class in Java represents a resizable array, which can grow or
         * shrink as needed.
         * <>: it is used to specify the type parameter for the ArrayList.
         * Type: This is the name of a class in Java, representing integer -> Integer
         * Class, etc .
         * myList: This is the name given to the variable that will reference the
         * ArrayList object. It can be any valid Java identifier.
         * new: Create a new instance of a class in heap memory.
         * ArrayList<>: This is the constructor call to create a new ArrayList instance.
         * The <> is the diamond operator, used to specify the type parameter for the
         * ArrayList.
         * In this case, it's empty, which means it will be inferred from the
         * declaration ArrayList<Integer>.
         * The (); at the end of new ArrayList<>(); is part of the syntax for invoking a
         * constructor in Java.
         */

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList);

        System.out.println(myList.get(2));

        myList.remove(2);
        System.out.println(myList);

        myList.set(2, 8);
        System.out.println(myList);

        myList.add(1, 9);
        System.out.println(myList);

        System.out.println(myList.contains(1));

        System.out.println("ArrayList size: " + myList.size());

        System.out.println(myList);
        System.out.println("Print Reverse: ");
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.print(myList.get(i) + " ");
        }

    }

}