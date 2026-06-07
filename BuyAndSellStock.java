
public class BuyAndSellStock {
    public static int Profit_Of_Stock(int Price[]){
        int var_buyprice =Integer.MAX_VALUE;
        int maxprofit =0;
       
for(int i=0; i<Price.length;i++){
    if(var_buyprice<Price[i]){
       int profit = Price[i]-var_buyprice;
        maxprofit =Math.max(maxprofit, profit);
    }
    else {
        var_buyprice=Price[i];
    }
   
}
    return maxprofit;   
}

public static void main (String args[]){
    int Price[] ={7,1,5,3,6,4};
   System.out.println( Profit_Of_Stock(Price));
}
}