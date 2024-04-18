import java.util.ArrayList;

public class C_SwapTwoNumber {

    public static void swapTwoIndex(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(0);
        list.add(1);
        list.add(6);

        System.out.println(list);
        swapTwoIndex(list, 2, list.size() - 1);
        System.out.println(list);

    }
}
