package newtestleaf.Foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestDigitinString {

	/*
	 * Given an alphanumeric string s, return the second largest numerical digit
	 * that appears in s, or -1 if it does not exist. An alphanumeric string is a
	 * string consisting of lowercase English letters and digits.
	 * 
	 * Example 1: Input: s = "dfa12321afd" Output: 2 Explanation: The digits that
	 * appear in s are [1, 2, 3]. The second largest digit is 2.
	 * 
	 * Example 2: Input: s = "abc1111" Output: -1 Explanation: The digits that
	 * appear in s are [1]. There is no second largest digit.
	 */

	/*
	 * Pseudo Code: 1) Get the alphaNum input str 2) Using regular expression, get
	 * only the number in the string 3) Convert it as a char array and sort it 4) if
	 * condition to check n.length-1 != n.length-2 5) return n.length-2 6) else
	 * return -1
	 */
	@Test
	public void test1()
	{
		int actual = secondLargestinStr("abc1111");
		Assert.assertEquals(actual, -1);
	}
	
	@Test
	public void test2()
	{
		int actual = secondLargestinStr("dfa12321afd");
		Assert.assertEquals(actual, '2');
	}

	public int secondLargestinStr(String alphaNum) {
		
		String onlyNum = alphaNum.replaceAll("\\D", "");
		char[] chars = onlyNum.toCharArray();
		Arrays.sort(chars);
		int len = chars.length;
		System.out.println(chars[len-2]);
		System.out.println(chars[len-1]);
		if (chars[len-1] != chars[len-2])
			//System.out.println(chars[len-2]);
			//String.valueOf(0)
			return (int)chars[len-2];           
		else return -1;
	}

}
