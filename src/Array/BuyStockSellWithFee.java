package Array;

/**
 * Created 12/01/22 1:22 PM
 *
 * @author Rohit Rawani
 */
public class BuyStockSellWithFee {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        int fee =2;
        int oldBuyProfit = -arr[0];
        int oldSoldProfit = 0;
        for(int i = 1; i < arr.length; i++){
            int newSoldProfit = 0;
            int newBuyProfit = 0;

            if(oldSoldProfit - arr[i] > oldBuyProfit){
                newBuyProfit = oldSoldProfit - arr[i];
            } else {
                newBuyProfit = oldBuyProfit;
            }

            if(oldBuyProfit + arr[i] - fee > oldSoldProfit){
                newSoldProfit = oldBuyProfit + arr[i] - fee;
            } else {
                newSoldProfit = oldSoldProfit;
            }
            oldBuyProfit = newBuyProfit;
            oldSoldProfit = newSoldProfit;
        }

        System.out.println(oldSoldProfit);
    }

    int returnMaxProfit(int[] arr, int fee){
        int oldBuyProfit = -arr[0];
        int oldSoldProfit = 0;
        for(int i = 1; i < arr.length; i++){
            int newSoldProfit = 0;
            int newBuyProfit = 0;

            if(oldSoldProfit - arr[i] > oldBuyProfit){
                newBuyProfit = oldSoldProfit - arr[i];
            } else {
                newBuyProfit = oldBuyProfit;
            }

            if(oldBuyProfit + arr[i] - fee > oldSoldProfit){
                newSoldProfit = oldBuyProfit + arr[i] - fee;
            } else {
                newSoldProfit = oldSoldProfit;
            }
            oldBuyProfit = newBuyProfit;
            oldSoldProfit = newSoldProfit;
        }
        return oldSoldProfit;
    }
}
