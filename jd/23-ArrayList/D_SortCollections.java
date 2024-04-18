import java.util.ArrayList; // collection
import java.util.Collections;

public class D_SortCollections {
    public static void main(String[] args) {

        /*
         * Collection:
         * Collection is an interface in the Java Collections Framework (JCF).
         * It represents a group of objects, known as elements.
         * It is the root interface in the collections hierarchy, from which other
         * interfaces like List, Set, and Queue are derived.
         * Implementations of Collection define specific data structures and behaviors
         * for storing and manipulating collections of objects.
         * 
         * 
         * Collections:
         * Collections is a utility class in Java's java.util package.
         * It provides static methods that operate on or return collections.
         * It contains various methods for performing common operations on collections,
         * such as sorting, searching, shuffling, and synchronization.
         * It cannot be instantiated because it contains only static methods.
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(0);
        list.add(3);

        System.out.println("Initial: " + list);
        Collections.sort(list);

        System.out.println("Ascending: " + list);

        // comparator functions that defines sorting logic
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);

        // ArrayList internal implementation
        /*
         *      
         * Creates a new array with increased capacity, often double the current
         * capacity.
         * Copies all existing elements from the old array to the new array.
         * Adds the new elements to the end of the new array.
         * Updates the internal reference to point to the new array.
         */
    }
}
