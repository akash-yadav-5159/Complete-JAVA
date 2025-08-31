public class stocks {
    public static void BuyAndSell(int prices[]){
        int profit;
        int buy=prices[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){//time to update buy
                buy=prices[i];
            }
            else{
                profit=prices[i]-buy;//today profit
                max=Math.max(profit,max);//maximum profit
            }
        }
        System.out.print("maximum profit can be : "+max);
    }
    public static void main(String[] args) {
        int prices[]={7,6,5,4,3,2};
        BuyAndSell(prices);
    }
}
