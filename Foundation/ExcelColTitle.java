package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Psuedo Code:
 * Initialize the empty str variable
 * While num > 0
 * num-1 % 26 and save the rem
 * sum up the remainder with Char 'A' to get the ascII value, and store the ascii val in a colName variable
 * result = columnname + str variable
 * num-1 divide by 26 to run the loop till > 0 and return the result
 */

public class ExcelColTitle {
	
	@Test
	public void test1()
	{
		String actual = excelColTitle(28);
		Assert.assertEquals(actual, "AB");
	}
	
	@Test
	public void test2()
	{
		String actual = excelColTitle(744);
		Assert.assertEquals(actual, "ABP");
	}
	
	public String excelColTitle(int num)
	{
		String result = "";
		while(num > 0)
		{
			int rem = (num-1) % 26;
			char colName = (char) (rem + 'A');
			result = colName + result;
			num = (num-1) / 26;
		}
		
		return result;
		
	}

}
