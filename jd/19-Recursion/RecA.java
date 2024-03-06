
public class RecA {

    // print n number dec
    public static void fun1(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        fun1(n - 1);
    }

    // print n number inc
    public static void fun2(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        fun2(n - 1);
        System.out.println(n);
    }

    // calculate factorial
    public static int fun3(int n) {
        if (n == 0) {
            return 1;
        }

        int fac = n * fun3(n - 1);
        return fac;
    }

    // calculate sum of number
    public static int fun4(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = fun4(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static boolean isSorted(int arr[], int start) {
        if (start == arr.length - 1) {
            return true;
        }
        if (arr[start] > arr[start + 1]) {
            return false;
        }
        return isSorted(arr, start + 1);

        // tc, sc = O(n)
    }

    // prob 7: WAF to find the first occurrence of an element in an array

    public static int isOccurred(int arr[], int start, int key) {
        if (arr[start] == key) {

            return start;
        }
        if (arr[start] > arr[start + 1]) {
            return -1;
        }
        return isOccurred(arr, start + 1, key);

        // tc, sc = O(n)
    }

    public static int isOccurredLast(int arr[], int start, int key) {
        if (start == arr.length) {
            return -1;
        }
        int isFound = isOccurredLast(arr, start + 1, key);
        if (isFound == -1 && arr[start] == key) {
            return start;
        }

        return isFound;
    }

    public static void main(String[] args) {

        // fun2(5);
        // System.out.println(fun4(5));

        int arr[] = { 1, 4, 3, 4 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(isOccurred(arr, 0, 4));
        System.out.println(isOccurredLast(arr, 0, 4));


    }

}