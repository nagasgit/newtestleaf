package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class ExcelSheetColumnNum {

	/*
	 * Excel Sheet Column Number Companies Given a string columnTitle that
	 * represents the column title as appears in an Excel sheet, return its
	 * corresponding column number.
	 * 
	 * For example: A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28 ...
	 * 
	 * Example 1: Input: columnTitle = "A" Output: 1
	 * 
	 * Example 2: Input: columnTitle = "AB" Output: 28
	 * 
	 * Example 3: Input: columnTitle = "ZY" Output: 701
	 * 
	 * Pseudo Code: Iterate through the characters of the column title in reverse
	 * order. Convert each character to its corresponding numeric value (A=1, B=2,
	 * ..., Z=26). Multiply the numeric value by the appropriate power of 26 based
	 * on its position in the column title. Sum up all the values to get the final
	 * column number.
	 * 
	 */

	@Test
	public void test1() {
		int actual = excelSheetColNum("ACC");
		Assert.assertEquals(actual, 757);
	}

	public int excelSheetColNum(String input) {
		int result = 0;
		int power = 1;
		char[] chars = input.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			int numericValue = (chars[i] - 'A') + 1;
			System.out.println(numericValue);
			// Character.getNumericValue(chars[i]);
			// System.out.println(Character.getNumericValue(chars[i]));
			result = result + numericValue * power; // 3+(3*26)+(81*26)
			System.out.println(result);
			power = power * 26;
			System.out.println(power);
		}
		return result;
		// 133
	}
}
