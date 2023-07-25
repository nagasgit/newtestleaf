package july15_hwprograms;

import org.junit.Test;

import junit.framework.Assert;

public class JewalsAndStones {

	/*
	 * You're given strings jewels representing the types of stones that are jewels,
	 * and stones representing the stones you have. Each character in stones is a
	 * type of stone you have. You want to know how many of the stones you have are
	 * also jewels. Letters are case sensitive, so "a" is considered a different
	 * type of stone from "A".
	 * 
	 * Example 1: Input: jewels = "aA", stones = "aAAbbbb" Output: 3
	 * 
	 * Example 2: Input: jewels = "z", stones = "ZZ" Output: 0
	 */

	@Test
	public void test1() {
		int actual = jewalsAndStonesCount("aA", "aAAbbbb");
		Assert.assertEquals(actual, 3);
	}

	@Test
	public void test2() {
		int actual = jewalsAndStonesCount("z", "ZZ");
		Assert.assertEquals(actual, 0);
	}

	public int jewalsAndStonesCount(String jewals, String stones) {

		int lenOfStones = stones.length();
		int length = jewals.length(); // Alt+shift+L to create a variable
		int count = 0;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < lenOfStones; j++) {
				if (jewals.charAt(i) == stones.charAt(j)) {
					count++;
				}
			}
		}

		return count;

	}

}
