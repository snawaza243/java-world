import java.util.ArrayList;

public class E_Multidimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        list2.remove(3);
        list2.remove(2);
        list1.remove(1);

        // System.out.println(list1);
        // System.out.println(list2);
        // System.out.println(list3);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> curList = mainList.get(i);
            for (int j = 0; j < curList.size(); j++) {
                System.out.print(curList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
