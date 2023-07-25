package july15_hwprograms;

import org.junit.Assert;
import org.junit.Test;

public class PlusOne {

	/*
	 * You are given a large integer represented as an integer array digits, where
	 * each digits[i] is the ith digit of the integer. The digits are ordered from
	 * most significant to least significant in left-to-right order. The large
	 * integer does not contain any leading 0's. Increment the large integer by one
	 * and return the resulting array of digits.
	 * 
	 * Example 1: Input: digits = [1,2,3] Output: [1,2,4] Explanation: The array
	 * represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus,
	 * the result should be [1,2,4].
	 * 
	 * Example 2: Input: digits = [4,3,2,1] Output: [4,3,2,2] Explanation: The array
	 * represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus,
	 * the result should be [4,3,2,2].
	 * 
	 * Example 3: Input: digits = [9] Output: [1,0] Explanation: The array
	 * represents the integer 9. Incrementing by one gives 9 + 1 = 10. Thus, the
	 * result should be [1,0].
	 * 
	 * Pseudo Code: 1) Get the input arr 2) create a new int array with input arr +
	 * 1 3) Traverse the loop from reverse order 4) if i < 9, then add input[i] + 1
	 * 5) else assign input[i] = 0 6) newinput
	 */

	@Test
	public void test1() {
		int[] actual = plusOne(new int[] { 9, 9, 9 });
		Assert.assertArrayEquals(actual, new int[] { 1, 0, 0, 0 });
	}

	public int[] plusOne(int[] input) {
		int len = input.length;
		for (int i = len - 1; i >= 0; i--) { // 199
			if (input[i] < 9) {
				input[i] = input[i] + 1;
				// plusOneArr[i] =
				return input;
			}
			input[i] = 0;
		}
		int[] plusOneArr = new int[len + 1];
		plusOneArr[0] = 1;
		return plusOneArr;
	}
}
