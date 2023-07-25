package july15_hwprograms;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber {
	
	/*
	    Given an array nums containing n distinct numbers in the range [0, n], 
	    return the only number in the range that is missing from the array.
	    
		Example 1:
		Input: nums = [3,0,1]
		Output: 2
		Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
		2 is the missing number in the range since it does not appear in nums.
		
		Example 2:
		Input: nums = [0,1]
		Output: 2
		Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
		2 is the missing number in the range since it does not appear in nums.
		
		Example 3:
		Input: nums = [9,6,4,2,3,5,7,0,1]
		Output: 8
		Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
		8 is the missing number in the range since it does not appear in nums.
		
		Pseudo Code:
		1) Find out the length of the numbers
		2) Arrays.sort
		3) for loop to traverse from 0 to n
		4) if i == n[i], if not return i as missing number
		
	 */
	
	@Test
	public void test1()
	{
		int actual = missingNum(new int[] {3,0,1});
		Assert.assertEquals(actual, 2);
	}
	
	@Test
	public void test2()
	{
		int actual = missingNum(new int[] {0,1});
		Assert.assertEquals(actual, 2);
	}
	
	@Test
	public void tests()
	{
		int actual = missingNum(new int[] {9,6,4,2,3,5,7,0,1});
		Assert.assertEquals(actual, 8);
	}
	
	
	public int missingNum(int[] n)
	{
		Arrays.sort(n);
		for(int i =n.length; i >= 0; i--)
		{
			if(i == n[i-1])
			{
				continue;
			}else return i;
		}
		
		return 0;
		
	}

}
