
//max profit
public class MaxProfit {

    public static void main(String a[]) {
       System.out.println( maxProfit(new int[] {2,4,1}));
    }

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price seen so far
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update the maximum profit if selling on this day is more profitable
            }
        }
        
        return maxProfit;
    }
}
