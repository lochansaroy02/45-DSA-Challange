public class BestTimetoSell {
    public static void main(String[] args) {

        int[] prices = { 7,6,4,3,1};
        System.out.println(bestTimetosell(prices));
    }

    public static int bestTimetosell(int[] prices) {
        int sell = Integer.MIN_VALUE;
        int buyIndex = getMin(prices);
        for (int i = buyIndex; i < prices.length; i++) {
            if(sell < prices[i]){
                sell  = prices[i];
            }
        }
        return  sell - prices[buyIndex];
    }
    
    public static int getMin(int[] prices) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
