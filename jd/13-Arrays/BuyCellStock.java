public class BuyCellStock {
    public static int buyCellStocks(int prices[]) {

        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 5, 7, 5, 3 };
        System.out.println(buyCellStocks(arr));
    }
}
