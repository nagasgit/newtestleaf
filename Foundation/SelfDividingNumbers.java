package newtestleaf.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SelfDividingNumbers {
	
	/*Pseudo code
	 * Initialize a flag variable 
	 * For loop to traverse from left to right integer
	 * Convert the i value to String 
	 * Create an Int array with string length
	 * add each charindex to the array 
	 */
	
	@Test
	public void test1()
	{
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(48,55));
		//List<Integer> actual = selfDivNums(45, 55);
		Assert.assertEquals(expected, selfDivNums(48, 55));
	}
	
	@Test
	public void test2()
	{
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22));
		//List<Integer> actual = selfDivNums(45, 55);
		Assert.assertEquals(expected, selfDivNums(1, 22));
	}
	
	@Test
	public void test3()
	{
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(48,55,66,77));
		//List<Integer> actual = selfDivNums(45, 55);
		Assert.assertEquals(expected, selfDivNums(47, 85));
	}
	
	public List<Integer> selfDivNums(int left, int right)
	{
		boolean flag = false;
		//String str = ",";
		List<Integer> num = new ArrayList<Integer>();
		//char[] chars = String.valueOf(left).toCharArray();
		//int n = left;
		for(int i = left; i <= right; i++)
		{
			 String str = String.valueOf(i);
			 int[] arr = new int[str.length()];
			for (int j = 0; j < str.length(); j++)
			{
				arr[j] = str.charAt(j)-'0';
				
				//Integer.parseInt(chars[i]);
				/*
				 * int n1 = chars[j]; System.out.println(chars[j]);
				 */
				//int j2 = (i % n1);
				//if (j2 == 0)
				/*
				 * { continue; }else { flag = 1; break; }
				 */
			}
			
			for (int val : arr) {
			
				if (val == 0)
				{
					flag = false;
					break;
				}else if((i % val)!=0) {
					flag = false;
					break;
				}else if((i%val)== 0)
				{
					flag = true;
					continue;
				}
				
			}
			if (flag == true)
			{
				num.add(i);
			}
			//return num;
		}
		return num;
	}

}
