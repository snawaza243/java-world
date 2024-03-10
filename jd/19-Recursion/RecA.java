
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

    // calculate sum of n number
    public static int fun4(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = fun4(n - 1);
        int sn = n + snm1;
        return sn;
    }

    // calculate the fibonacci number
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fm1 = fibonacci(n - 1);
        int fm2 = fibonacci(n - 2);
        int fm = fm1 + fm2;

        return fm;
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

    public static int findPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * findPow(x, n - 1);
    }

    public static int findPowOpt(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = findPowOpt(x, n / 2);
        int halfPowSq = halfPow * halfPow;

        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;

        }

        return halfPowSq;
    }

    public static int tilingProb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // task
        // i. vertical
        int fnm1 = tilingProb(n - 1);

        // ii. horizontal
        int fnm2 = tilingProb(n - 2);

        int totWays = fnm1 + fnm2;

        return totWays;

    }

    // remove duplicate string from a string
    public static void remDup(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char curChar = str.charAt(idx);

        if (map[curChar - 'a'] == true) {
            remDup(str, idx + 1, newStr, map);
        }

        else {
            map[curChar - 'a'] = true;
            remDup(str, idx + 1, newStr.append(curChar), map);
        }
    }

    // friends pairing problem

    public static int friendPair(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = friendPair(n - 1);
        int fnm2 = friendPair(n - 2);
        int pairWays = (n - 1) * fnm2;

        int totWays = fnm1 + pairWays;

        return totWays;
    }

    public static void printBiStr(int n, int lastPlace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBiStr(n - 1, 0, str + "0");

        if (lastPlace == 0) {
            printBiStr(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        // fun2(5);
        // System.out.println(fun4(5));

        // int arr[] = { 1, 4, 3, 4 };

        // System.out.println(fibonacci(6));

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i + " = " + fibonacci(i));
        // }

        // System.out.println(isSorted(arr, 0));
        // System.out.println(isOccurred(arr, 0, 4));
        // System.out.println(isOccurredLast(arr, 0, 4));

        // System.out.println(findPow(3, 4));
        // System.out.println(findPowOpt(3, 4));

        // System.out.println(tilingProb(4));

        // String str = "inddianntechhnoerra";
        // StringBuilder sb = new StringBuilder();
        // boolean mp[] = new boolean[26];
        // remDup(str, 0, sb, mp);

        // System.out.println(friendPair(3));

        printBiStr(3, 0, "");
    }

}