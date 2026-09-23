class Solution {
    public int maxProfit(int[] prices) {

        int left=0,right=1;

        int maxP = 0, profit; 

        while(right < prices.length){

            if(prices[left]<prices[right]){
                profit = prices[right] - prices[left];

                maxP = Math.max(maxP,profit);
            }
            else{
                left = right;
            }


            right++;


        }

        return maxP;
        
    }
}
