import java.util.ArrayList;

public class J_PairSum2Brute {

    public static boolean pairSum1Brute(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println(i + "(" + list.get(i) + ") + " + j + "(" + list.get(j) + ") = " + target);
                    return true;
                }
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
        System.out.println(pairSum1Brute(list, 16));

    }
}
