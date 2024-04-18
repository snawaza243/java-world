import java.util.ArrayList;

public class K_PairSum2Pointer {

    public static boolean pairSum1TwoPointer(ArrayList<Integer> list, int target) {

        int breakPoint = -1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakPoint = i;
                break;
            }
        }

        int lp = breakPoint + 1;
        int rp = breakPoint;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.println(lp + "(" + list.get(lp) + ") + " + rp + "(" + list.get(rp) + ") = " + target);

                return true;
            }

            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        // Pair Sum 2: Find if any pair in a sorted & rotated arraylist has a target sum.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        System.out.println(pairSum1TwoPointer(list, 256));

    }
}
