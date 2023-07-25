package july15_hwprograms;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceAllDigitswithChar {

	/*
	 * You are given a 0-indexed string s that has lowercase English letters in its
	 * even indices and digits in its odd indices. There is a function shift(c, x),
	 * where c is a character and x is a digit, that returns the xth character after
	 * c. For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'. For every odd
	 * index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).
	 * 
	 * Return s after replacing all digits. It is guaranteed that shift(s[i-1],
	 * s[i]) will never exceed 'z'. Example 1:
	 * 
	 * Input: s = "a1c1e1" Output: "abcdef" Explanation: The digits are replaced as
	 * follows: - s[1] -> shift('a',1) = 'b' - s[3] -> shift('c',1) = 'd' - s[5] ->
	 * shift('e',1) = 'f' Example 2:
	 * 
	 * Input: s = "a1b2c3d4e" Output: "abbdcfdhe" Explanation: The digits are
	 * replaced as follows: - s[1] -> shift('a',1) = 'b' - s[3] -> shift('b',2) =
	 * 'd' - s[5] -> shift('c',3) = 'f' - s[7] -> shift('d',4) = 'h'
	 * 
	 * Pseudo Code: 1) Get the input string 2) find out the length of the string 3)
	 * For loop to traverse from 0 index to s-1 4) if s[i] < 'a' 5) s[i] =
	 * s[i-1]+s[i] 6) Return string
	 * 
	 * 
	 */

	@Test
	public void test1() {
		String actual = replaceAllDigits("a1b2c3d4e");
		Assert.assertEquals(actual, "abbdcfdhe");
	}
	
	@Test
	public void test2() {
		String actual = replaceAllDigits("a1c1e1");
		Assert.assertEquals(actual, "abcdef");
	}

	public String replaceAllDigits(String s) {
		int len = s.length();
		char[] chars = s.toCharArray();
		for (int i = 1; i < len; i += 2) {
			char preChar = chars[i - 1];
			int charVal = Character.getNumericValue(chars[i]);
			chars[i] = (char) (preChar + charVal);
			System.out.println(chars[i]);

		}

		// System.out.println(chars.toString());
		return new String(chars);
	}

}
