package newtestleaf.Foundation;

import org.junit.Assert;
import org.junit.Test;

public class BuySellStocks1 {

	/*
	 * You are given an array prices where prices[i] is the price of a given stock
	 * on the ith day. You want to maximize your profit by choosing a single day to
	 * buy one stock and choosing a different day in the future to sell that stock.
	 * Return the maximum profit you can achieve from this transaction. If you
	 * cannot achieve any profit, return 0.
	 * 
	 * Example 1: Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2
	 * (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying
	 * on day 2 and selling on day 1 is not allowed because you must buy before you
	 * sell. Example 2:
	 * 
	 * Input: prices = [7,6,4,3,1] Output: 0 Explanation: In this case, no
	 * transactions are done and the max profit = 0.
	 * 
	 * 
	 * 
	 */
	@Test
	public void test1() {
		int actual = maximumProfit(new int[] { 7, 1, 5, 3, 6, 4 });
		// System.out.println(actual);
		Assert.assertEquals(actual, 5);
	}

	@Test
	public void test2() {
		int actual = maximumProfit(new int[] { 7, 6, 4, 3, 1 });
		// System.out.println(actual);
		Assert.assertEquals(actual, 0);
	}

	@Test
	public void test3() {
		int actual = maximumProfit(new int[] { 8, 1, 9, 3, 2 });
		// System.out.println(actual);
		Assert.assertEquals(actual, 8);
	}

	public int maximumProfit(int[] prices) {
		// [7,1,5,3,6,4]
		int lowPrice = prices[0];
		int sellPrice = prices[1];
		int profit = 0;
		int index1 = 0;
		int index2 = 0;

		int len = prices.length;

		for (int i = 1; i < len; i++) {
			if (prices[i] < lowPrice) {
				lowPrice = prices[i];
				index1 = i;
				System.out.println(index1);
			}
		}

		for (int i = 1; i < len; i++) {
			if (prices[i] > sellPrice) {
				sellPrice = prices[i];
				index2 = i;
				System.out.println(index2);
			}
		}
		if (index1 < index2) {
			profit = sellPrice - lowPrice;
			return profit;
		}
		return 0;
	}

}
