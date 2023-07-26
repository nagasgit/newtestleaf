package july8.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyAndSellStocks {

    /*
        You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one stock and
        choosing a different day in the future to sell that stock.  Return the maximum profit you can
        achieve from this transaction. If you cannot achieve any profit, return 0.

        Example 1:
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before
        you sell.
        Example 2:
        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.

        Pseudo Code:
        1) Get the int array
        2) Initialize variables - buy value, sell value = 0, maxProfit =0
        3) Assign buy value = Integer.MaxValue
        4) for loop to traverse through int array
        5) if input[i] < buyVal, then assign buyVal = input[i]
        6) Subtract the current stock price (input[i]) minus buyVal and store it in
           current profit
        7) if (maxProfit < currentProfit)
              maxProfit = currentProfit;
        8) Return maxProfit

     */

    @Test
    public void test1()
    {
        int actual = BuyAndSellStocks(new int[]{7, 1, 5, 3, 6, 4});
        Assert.assertEquals(actual,5);
    }

    @Test
    public void test2()
    {
        int actual = BuyAndSellStocks(new int[]{7,6,4,3,1});
        Assert.assertEquals(actual,0);
    }
    public int BuyAndSellStocks(int[] input) {
        int maxProfit = 0;
        int buyVal = Integer.MAX_VALUE;
        int currentProfit = 0;
        //[7,1,5,3,6,4]
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] < buyVal)  // 5 < 1
            {
                buyVal = input[i]; //7,1
            }
            currentProfit = input[i] - buyVal;  //0,0,4,2,5,3
            if (maxProfit < currentProfit)       // 4 < 5, 5 < 3
            {
                maxProfit = currentProfit;  //4, 5
            }
        }
        return maxProfit;
    }

}
