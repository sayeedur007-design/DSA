// File name: buysellstock.java

class Solution {
    public int stockBuySell(int[] arr, int n) {
        int buy = arr[0];
        int profit = 0;

        for(int i = 1; i < arr.length; i++) {
            profit = Math.max(profit, arr[i] - buy);
            buy = Math.min(buy, arr[i]);
        }

        return profit;
    }
}

public class buysellstock {
    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 8, 11, 9};

        Solution obj = new Solution();
        System.out.println(obj.stockBuySell(arr, arr.length));
    }
}