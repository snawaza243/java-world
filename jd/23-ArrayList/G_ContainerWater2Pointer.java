import java.util.ArrayList;

public class G_ContainerWater2Pointer {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // find the smaller one, then move in
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;

            int currentWater = ht * width;
            maxWater = Math.max(maxWater, currentWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        // Container with most water using 2 pointer approach with linear time complexity O()
        
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
