import java.util.ArrayList;

public class F_ContainerWaterBrute {

    public static int storeWaterBrute(ArrayList<Integer> height) {

        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = 0; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int curWater = ht * width;

                maxWater = Math.max(maxWater, curWater);
            }
        }

        return maxWater;
    }

    // TC = O(n^2)

    public static void main(String[] args) {
        // Container with most water using brute force approach with  time complexity O(n^2)
        // for given n lines on x-axis, use 2 lines to form a container such that it holds max water.


        
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

        System.out.println(storeWaterBrute(height));
    }
}
