import java.util.ArrayList;

public class I_PairSum1Pointer {

    public static boolean pairSum1TwoPointer(ArrayList<Integer> list, int target) {

        int lp = 0;
        int rp = list.size() - 1;

        while (lp !=rp) {
            if(list.get(lp) + list.get(rp) == target)
            {
                return true;
            }

            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        // Pair Sum 1: Find if any pair in a sorted arraylist has a target sum.


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        System.out.println(pairSum1TwoPointer(list, 55));

    }
}
