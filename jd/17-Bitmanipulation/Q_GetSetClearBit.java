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

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // clearithBit(n, i);
        // } else {
        // setithBit(n, i);
        // }

        n = clearithBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;

    }

    public static int clearLastIth(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;

        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.out.println(getithBit(10, 3));
        // System.out.println(setithBit(10, 2));
        // System.out.println(clearithBit(10, 1));

        // System.out.println(updateIthBit(10, 2, 1)); // 14

        // System.out.println(clearLastIth(15, 2));

        System.out.println(clearBitRange(10, 2, 4));

    }
}
