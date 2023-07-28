package newtestleaf.Foundation;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import junit.framework.Assert;

public class PNos {
	
	@Test
	public void test1()
	{
		int actual = pNos(10);
		Assert.assertEquals(actual, 7532);
		//Assert.ass(new char[] {'7','5','3','2'}, new char[] {'7','5','3','2','1'});
	}
	
	@Test
	public void test2()
	{
		int actual = pNos(11);
		Assert.assertEquals(actual, 117532);
		//assertArrayEquals(actual, new char[] {'7','8','3','2'});
		//Assert.ass(new char[] {'7','5','3','2'}, new char[] {'7','5','3','2','1'});
	}
	
	public int pNos(int no) {
		int flag = 0;
		String str = "";
		while (no > 1)
		{
			flag = 0;
			for (int i = 2; i <= no/2; i++)
			{
				//no = no / i;
				if ((no%i)== 0)
				{
					flag=flag+1;
					break;
				}
				//no--;
			}
			if (flag == 0) {
				str = str + no;
			}
			no--;
		}
		//char[] charArray = str.toCharArray();
		return Integer.parseInt(str);
		//return charArray;
	}

}
