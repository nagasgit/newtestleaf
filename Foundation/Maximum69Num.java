package july15_hwprograms;

import org.junit.Test;

import junit.framework.Assert;

public class Maximum69Num {

	/*
	 * You are given a positive integer num consisting only of digits 6 and 9.
	 * Return the maximum number you can get by changing at most one digit (6
	 * becomes 9, and 9 becomes 6).
	 * 
	 * Example 1: Input: num = 9669 Output: 9969 Explanation: Changing the first
	 * digit results in 6669. Changing the second digit results in 9969. Changing
	 * the third digit results in 9699. Changing the fourth digit results in 9666.
	 * The maximum number is 9969. Example 2: Input: num = 9996 Output: 9999
	 * Explanation: Changing the last digit 6 to 9 results in the maximum number.
	 * Example 3: Input: num = 9999 Output: 9999 Explanation: It is better not to
	 * apply any change.
	 * 
	 * Pseudo Code: 1) Convert the integer to char array 2) For loop to traverse
	 * from 0 to char length 3) if chararray[i] == '6' then replace the char with
	 * '9' 4) break; 5) convert the charArray to Integer (Integer.parseInt(new
	 * String(charArray)))
	 */

	@Test
	public void test1() {
		int actual = maximumNum(9996);
		Assert.assertEquals(actual, 9999);
	}

	@Test
	public void test2() {
		int actual = maximumNum(9669);
		Assert.assertEquals(actual, 9969);
	}

	@Test
	public void test3() {
		int actual = maximumNum(9999);
		Assert.assertEquals(actual, 9999);
	}

	public int maximumNum(int num) {
		int num1 = 0;
		char[] charArray = String.valueOf(num).toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '6') {
				charArray[i] = '9';
				break;
			}

			/*
			 * int intVal = Integer.parseInt(new String(charArray)); if (intVal > num) {
			 * num1 = intVal; }
			 */
		}
		return Integer.parseInt(new String(charArray));
	}

}
