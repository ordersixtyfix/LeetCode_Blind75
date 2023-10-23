    package solutions;
    public class q_121 {

        public static int maxProfit(int[] prices) {

            if (prices.length == 0) {
                return 0;
            }

            int maxProfit = 0;
            int minPrice = prices[0];

            for (int i = 1; i < prices.length; i++) {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                }
            }

            return maxProfit;
        }


        public static void main(String[] args) {

            int arr = maxProfit(new int[]{7,6,4,3,1});
            System.out.println(arr);


        }


    }
