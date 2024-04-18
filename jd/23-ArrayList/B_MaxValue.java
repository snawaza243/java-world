import java.util.ArrayList;

public class B_MaxValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(5);
        list.add(1);

        int max = Integer.MIN_VALUE;
        for (int i : list) {
            // if (max < i) {
            //     max = i;
            // }
            max = Math.max(max,i);
        }
        System.out.println("The maximum value is " + max);

    }
}
