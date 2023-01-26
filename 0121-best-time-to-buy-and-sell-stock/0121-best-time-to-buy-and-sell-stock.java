class Solution {
    public int maxProfit(int[] prices) {
        int BP=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(BP<prices[i]){
                int profit=prices[i]-BP;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                BP=prices[i];
            }
        }
        return maxProfit;
    }
    

}