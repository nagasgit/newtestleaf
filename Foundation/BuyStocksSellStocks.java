<<<<<<< HEAD
package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;
=======
package july8.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
>>>>>>> e3f5046c4e330497d4f4079f77fc0ef9c1f0193f

public class BuyStocksSellStocks {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a
    different day in the future to sell that stock. Return the maximum profit you can achieve
    from this transaction. If you cannot achieve any profit, return 0.
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
    */

    /* PseudoCode:
       1) Declare two variables, minBuyVal and maxSellVal
       2) Assign the first array value to minBuyVal variable
       3) for loop to traverse from 0 to input length
       4) if condition to check input[i] < minBuyVal, if yes then assign input[i] to minBuyVal
          and assign the i position to position variable
       5) Assign input[position] --> maxSellVal
       6) for loop to traverse from minBuyVal to array length
       7) if condition to check input[j] > maxSellVal
       8) if yes, assign input[j] to maxSellVal
       9) now profit ==> maxSellVal - minBuyVal and return profit

     */

    @Test
    public void test1()
    {
        int actual = stocksProg(new int[]{7, 1, 5, 3, 6, 4});
        Assert.assertEquals(actual,5);
    }

    @Test
    public void test2()
    {
        int actual = stocksProg(new int[]{7,6,4,3,1});
        Assert.assertEquals(actual,0);
    }
    public int stocksProg(int[] input) {
        int minBuyVal = input[0];
        int maxSellVal;
        int position = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < minBuyVal) {
                minBuyVal = input[i];
                position = i;
            }
        }
        maxSellVal = input[position];

        for (int j = position; j <= input.length - 1; j++) {
            if (input[j] > maxSellVal) {
                maxSellVal = input[j];
            }
        }
        int profit = maxSellVal - minBuyVal;
        return profit;
    }

}
