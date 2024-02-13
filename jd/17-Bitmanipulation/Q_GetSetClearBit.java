public class Q_GetSetClearBit {

    public static int getithBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.out.println(getithBit(10, 3));
        // System.out.println(setithBit(10, 2));

        System.out.println(clearithBit(10, 1));
    }
}
