package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class ExcelColumnNum {

	@Test
	public void test1() {
		int actual = excelColNum("ABP");
		Assert.assertEquals(actual, 744);
	}

	public int excelColNum(String str) {
		int power = 1;
		int result = 0;
		char[] chars = str.toCharArray(); // BA
		for (int i = chars.length - 1; i >= 0; i--) {
			result = (result + (chars[i] - 'A' + 1) * power); // 0+1*1
			power = power * 26;
		}

		return result;

	}

}
